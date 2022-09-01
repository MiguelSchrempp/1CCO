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
    cpu_percent,
    disk_usage,
)

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
    mem_tui3 = ui.items[0].items[1]
    mem_tui2 = ui.items[0].items[2]
    # # Ram
    ram_tui = mem_tui.items[0]
    ram_tui3 = mem_tui3.items[0]
    ram_tui2 = mem_tui2.items[0]
    ram_tui.value = virtual_memory().percent

    ram3 = ram_tui.value + ((ram_tui.value/100) * 10)
    ram2 = ram_tui.value + ((ram_tui.value/100) * 15)

    ram_tui.title = f'RAM {round(ram_tui.value, 2)} %'
    ram_tui3.title = f'RAM {round(ram3, 2)} %'
    ram_tui2.title = f'RAM {round(ram2, 2)} %'
    

    # # CPU
    cpu_tui = ui.items[1].items[0]
    cpu_tui3 = ui.items[1].items[1]
    cpu_tui2 = ui.items[1].items[2]

    proc_tui = cpu_tui.items[0]
    proc_tui3 = cpu_tui3.items[0]
    proc_tui2 = cpu_tui2.items[0]
    proc_tui.value = cpu_percent()

    
    # CPU %
    cpu_percent_tui = cpu_tui.items[0]
    ps_cpu_percent = cpu_percent()
    cpu_percent_tui.text = ps_cpu_percent
    cpu_percent_tui.title = f'CPU Total {ps_cpu_percent}%'

    proc3 = cpu_percent_tui.value + ((cpu_percent_tui.value/100) * 10)
    proc2 = cpu_percent_tui.value + ((cpu_percent_tui.value/100) * 15)

    proc_tui.title = f'CPU {round(cpu_percent_tui.value, 2)} %'
    proc_tui3.title = f'CPU {round(proc3, 2)} %'
    proc_tui2.title = f'CPU {round(proc2, 2)} %'

    # # Disco
    disk_tui = ui.items[2].items[0]
    disk_tui3 = ui.items[2].items[1]
    disk_tui2 = ui.items[2].items[2]
    disk_tui.text = ''
    disk_tui3.text = ''
    disk_tui2.text = ''

    disk_tui.text += f'\nEspaço em disco utilizado: {round(disk_usage("/").percent, 2)}%'
    disk_tui3.text += f'Partição: {round(disk_usage("/").percent * 0.95, 2) }%'
    disk_tui2.text += f'Partição: {round(disk_usage("/").percent * 0.33, 2) }%'   


    try:
        ui.display()
        sleep(2)
    except KeyboardInterrupt:
        break