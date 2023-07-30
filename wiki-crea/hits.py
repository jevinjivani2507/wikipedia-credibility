import pandas as pd
import networkx as nx


# Load the CSV file using pandas
df = pd.read_excel('input.xlsx')


# Create a NetworkX graphpd.read_excel
G = nx.Graph()


# # Add edges to the graph
source = {}
for i, row in df.iterrows():
    x = row['source']
    y = row['target']
    # print(x,y,i)
    source[x] = 1
    G.add_edge(x,y)


# # Print some basic information about the graph
# print(G.edges)
# print(d)
hubs, authorities = nx.hits(G, max_iter = 50, normalized = True)

final = {}

# print(hubs)
# print(bc)
# print(authorities)


for i,j in hubs.items():
    if(i in source):
        final[i] = j


for i,j in authorities.items():
    if(i in source):
        final[i] += j
 
 
f = open('author_author.txt', 'w')
# with open('output.txt', 'w') as f:
# f.write('Hello, world!\n')
for i,j in final.items():
    lines = [i,j]
    print(*lines, sep=' ', file=f)
    # Write a string to the file
