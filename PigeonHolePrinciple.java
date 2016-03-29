for i
  for j
    let b = a[i] xor a[j]
    find all values in multimap with key b
`     if value.first not equal to i or j and value.second not equal to i or j
        then print Yes and exit
    add (key = b, value = (i,j)) to multimap
print No
