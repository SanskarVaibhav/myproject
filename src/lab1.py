def search(pattern, txt):
	M = len(pattern)
	N = len(txt)

	# A loop to slide pattern[] one by one */
	for i in range(N - M + 1):
		j = 0

		# For current index i, check
		# for pattern match */
		while(j < M):
			if (txt[i + j] != pattern[j]):
				break
			j += 1

		if (j == M):
			print("Pattern found at index ", i)


# Driver's Code
if __name__ == '__main__':
	txt = "AABAACAADAABAAABAA"
	pattern = "AABA"
	
	# Function call
	search(pattern , txt)

