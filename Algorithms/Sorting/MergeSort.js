var sortArray = (mergesort = function(nums) {
  if (nums.length <= 1) return nums;
  let len = nums.length;
  // sort the left half until it array's length reach to 1
  let left = mergesort(nums.slice(0, Math.floor(len / 2)));
  // sort the right half until  array's length reach to 1
  let right = mergesort(nums.slice(Math.floor(len / 2)));
  return merge(left, right);
});

function merge(left, right) {
  let i = 0,
    j = 0;
  let res = [];
  while (i < left.length && j < right.length) {
    if (left[i] < right[j]) {
      res.push(left[i]);
      i++;
    } else {
      res.push(right[j]);
      j++;
    }
  }
  while (i < left.length) {
    //pushing remaining left over in left array
    res.push(left[i]);
    i++;
  }
  while (j < right.length) {
    //pushing remaining left over in right array
    res.push(right[j]);
    j++;
  }
  return res;
}
merge([1, 4, 5, 7, 8, 9, 2, 1]);
