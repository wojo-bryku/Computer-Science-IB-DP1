# List of names
names = [
    "Maria Masztalerz",
    "Justyna Michalik",
    "Jowita Gołąb",
    "Dawid Kiściński",
    "Bartosz Kalemba",
    "Paweł Krzywda",
    "Gabriela Stoch",
    "Alicja Kurek",
    "Victoria Miśkowicz",
    "Filip Grotowski",
    "Natalia Joniec",
    "Karolina Zaręba",
    "Jonasz Kądziołka",
    "Błażej Boguszewski",
    "Bartłomiej Morawik",
    "Krzysztof Chudziak",
    "kamiljoachimiak0888@gmail.com",
    "Anna Kurek",
    "Anna Machnik",
    "Szymon Pałka",
    "Szymon Pałka",
    "Jakub Kwaśniewski",
    "Filip Pluta",
    "Anri Muradyan",
    "Konrad Ner",
    "Damian Ptasznik",
    "Wojciech Zalewski",
    "Daria Ivanchenko",
    "Oskar Worgacz",
    "Jan Maderak",
    "Igor Batko",
    "Jakub Studnicki",
    "Bartłomiej Wilk",
    "Hubert Januszek",
    "Julia Zagórna",
    "Emilia Fiutowska",
    "Szymon Nowak",
    "Małgorzata Denko",
    "Franciszek Lorenc",
    "Okarma Kacper",
    "Cezary Zajfryd",
    "Amelia Zegiel"
]

# Function to format names
def format_name(name):
    parts = name.split()
    if len(parts) == 2:
        return f'"{parts[0]}","{parts[1]}"'
    else:
        return f'"{name}",""'

# Format the names and create the output
formatted_names = [format_name(name) for name in names]

# Join the formatted names with newline characters
output = "\n".join(formatted_names)

# Print or save the output
print(output)

