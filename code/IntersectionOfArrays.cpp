#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

class Solution
{
public:
    std::vector<int> intersection(std::vector<int> &nums1, std::vector<int> &nums2)
    {
        std::unordered_set<int> set(nums1.begin(), nums1.end());
        std::vector<int> result;

        for (int num : nums2)
        {
            if (set.count(num))
            {
                result.push_back(num);
                set.erase(num); // Ensure uniqueness
            }
        }

        return result;
    }
};

int main()
{
    Solution sol;
    vector<int> nums1;
    nums1.push_back(1);
    nums1.push_back(2);
    nums1.push_back(2);
    nums1.push_back(1);
    vector<int> nums2(2, 2); // Fix: Use constructor to initialize nums2
    vector<int> result = sol.intersection(nums1, nums2);
    for (int i = 0; i < result.size(); i++)
    {
        cout << result[i] << " ";
    }
    cout << endl;
    return 0;
}