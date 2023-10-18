

import collections
string = 'thequickbrownfoxjumpsoverthelazydog'
d = collections.defaultdict(int)
for x in string:
    d[x] += 1
for i in sorted(d,key=d.get,reverse = True):
    if d[i] > 1:
	    print('%s %d' % (i,d[i]))
