from time import sleep
from dashing import (
    HSplit, 
    VSplit, 
    VGauge, 
    HGauge, 
    Text
)
from psutil import (
    virtual_memory,
    sensors_battery,
    cpu_percent,
    disk_usage,
    users,
    boot_time,
    pids,
    process_iter
)

# login = input('Digite o login do funcionário: ')
# senha = input('Digite a senha do funcionário: ')

def bytes_to_gigas(value):
    return value / 1024 / 1024 / 1024


ui = HSplit(  # ui
    VSplit(
        HSplit(  # ui.items[0]
            VGauge(title='RAM'),  # ui.items[0].items[0]
            title='Memória',
            border_color=3
        ),
        HSplit(  # ui.items[0]
            VGauge(title='RAM'),  # ui.items[0].items[0]
            title='Memória 2',
            border_color=3
        ),
        HSplit(  # ui.items[0]
            VGauge(title='RAM'),  # ui.items[0].items[0]
            title='Memória 3',
            border_color=3
        )
    ),
    VSplit(  # ui.items[1]
        HSplit(
            VGauge(title=''),
            title='CPU',
            border_color=5,
        ),
            HSplit(
            VGauge(title=''),
            title='CPU 2',
            border_color=5,
        ),
        HSplit(
            VGauge(title=''),
            title='CPU 3',
            border_color=5,
        )
    ),
    VSplit(  # ui.items[2]
        Text(
            ' ',
            title='Disco',
            border_color=4
        ),
        Text(
            ' ',
            title='Disco 2',
            border_color=6,
        ),
        Text(
            ' ',
            title='Disco 3',
            border_color=6,
        ),
    ),
)

while True:

    # # Memória
    mem_tui = ui.items[0].items[0]
    mem_tui2 = ui.items[0].items[1]
    mem_tui3 = ui.items[0].items[2]
    # # Ram
    ram_tui = mem_tui.items[0]
    ram_tui2 = mem_tui2.items[0]
    ram_tui3 = mem_tui3.items[0]
    ram_tui.value = virtual_memory().percent

    ram2 = ram_tui.value + ((ram_tui.value/100) * 15)
    ram3 = ram_tui.value + ((ram_tui.value/100) * 10)

    ram_tui.title = f'RAM {round(ram_tui.value, 2)} %'
    ram_tui2.title = f'RAM {round(ram2, 2)} %'
    ram_tui3.title = f'RAM {round(ram3, 2)} %'

    # # CPU
    cpu_tui = ui.items[1].items[0]
    cpu_tui2 = ui.items[1].items[1]
    cpu_tui3 = ui.items[1].items[2]

    proc_tui = cpu_tui.items[0]
    proc_tui2 = cpu_tui2.items[0]
    proc_tui3 = cpu_tui3.items[0]
    # CPU %
    cpu_percent_tui = cpu_tui.items[0]
    ps_cpu_percent = cpu_percent()
    cpu_percent_tui.value = ps_cpu_percent
    cpu_percent_tui.title = f'CPU Total {ps_cpu_percent}%'

    cpu2 = cpu_percent_tui.value + ((cpu_percent_tui.value/100) * 10)

    cpu3 = cpu_percent_tui.value + ((cpu_percent_tui.value/100) * 15)

    proc_tui.title = f'CPU {round(cpu_percent_tui.value, 2)} %'
    proc_tui2.title = f'CPU {round(cpu2, 2)} %'
    proc_tui3.title = f'CPU {round(cpu3, 2)} %'
    
    # # Disco
    disk_tui = ui.items[2].items[0]
    disk_tui2 = ui.items[2].items[1]
    disk_tui3 = ui.items[2].items[2]
    disk_tui.text = ''

    discoR2 = disk_usage("/").percent - ((disk_usage("/").percent / 100) * 5)

    discoR3 = discoR2 * 3

    disk_tui.text = f'\nEspaço em disco utilizado: {round(disk_usage("/").percent, 2)}%'
    disk_tui2.text = f'\nEspaço em disco utilizado: {round(discoR2, 2)}%'
    disk_tui3.text = f'\nEspaço em disco utilizado: {round(discoR3, 2)}%'


    try:
        ui.display()
        sleep(3.75)
    except KeyboardInterrupt:
        break
