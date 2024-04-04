def merge_arrays(X, Y):
    # Pointer for X
    i = len(X) - 1 - len(Y)
    # Pointer for Y
    j = len(Y) - 1
    # Pointer for the end of merged array
    k = len(X) - 1

    # Merge elements of X and Y, starting from the end
    while i >= 0 and j >= 0:
        if X[i] > Y[j]:
            X[k] = X[i]
            i -= 1
        else:
            X[k] = Y[j]
            j -= 1
        k -= 1

    # Copy remaining elements of Y if any
    while j >= 0:
        X[k] = Y[j]
        j -= 1
        k -= 1

# Test
X = [0, 2, 0, 3, 0, 5, 6, 0, 0]
Y = [1, 8, 9, 10, 15]

merge_arrays(X, Y)
print("Merged array:", X)