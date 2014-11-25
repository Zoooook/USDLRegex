package validate.basic
import model.State

class LicenseValidator {
    static boolean checkLicense(State licenseState, String licenseNumber){
        if(!licenseState) return false
        switch(licenseState.abbreviation){
            case 'AL':
            case 'AK':
            case 'ME':
                return licenseNumber.matches(/^[0-9]{7}$/) // 7 Numeric
            case 'AR':
            case 'CO':
            case 'GA':
            case 'IA':
            case 'MS':
            case 'NM':
            case 'NY':
                return licenseNumber.matches(/^[0-9]{9}$/) // 9 Numeric
            case 'HI':
            case 'KY':
            case 'VA':
                return licenseNumber.matches(/^[a-zA-Z0-9][0-9]{8}$/) // 1 AlphaNumeric + 8 Numeric
            case 'IN':
            case 'NV':
                return licenseNumber.matches(/^[0-9]{10}$/) // 10 Numeric
            case 'FL':
            case 'MD':
            case 'MN':
                return licenseNumber.matches(/^[a-zA-Z][0-9]{12}$/) // 1 Alpha + 12 Numeric

            case 'AZ': return licenseNumber.matches(/^[aAbBdDyY0-9][0-9]{8}$/) // ('A', 'B', 'D', 'Y', or 1Numeric) + 8Numeric -- LN
            case 'CA': return licenseNumber.matches(/^[a-zA-Z][0-9]{7}$/) // 1 Alpha + 7 Numeric
            case 'CT': return licenseNumber.matches(/^(0[1-9]|1[0-9]|2[0-4])[0-9]{7}$/) // 9 Numeric, first two digits must be between 01 and 24 -- LN
            case 'DE': return licenseNumber.matches(/^[0-9]{1,7}$/) // 1-7 Numeric
            case 'DC': return licenseNumber.matches(/^([0-9]{7})|([0-9]{9})$/) // 7 Numeric or 9 Numeric
            case 'ID': return licenseNumber.matches(/^([0-9]{9}|[a-zA-Z]{2}[0-9]{6}[a-zA-Z])$/) // 9 Numeric or 2 Alpha + 6 Numeric + 1 Alpha
            case 'IL': return licenseNumber.matches(/^[a-zA-Z][0-9]{11}$/) // 1 Alpha + 11 Numeric
            case 'KS': return licenseNumber.matches(/^[kK][0-9]{8}$/) // 'K' + 8 Numeric
            case 'LA': return licenseNumber.matches(/^0[0-9]{8}$/) // '0' + 8 Numeric
            case 'MA': return licenseNumber.matches(/^[a-zA-Z][0-9]{8}$/) // 1 Alpha + 8 Numeric
            case 'MI': return licenseNumber.matches(/^[a-zA-Z]([0-6]{3}|7(2[6-9]|[34][0-9]|50))[0-9]{9}$/) // 1 AlphaNumeric + 12 Numeric, first 3 numbers can't be 7, 8, or 9, except they can be in the 726-750 range -- LN
            case 'MO': return licenseNumber.matches(/^([0-9]{9}|[a-zA-Z][0-9]{5,9})$/) // 9 Numeric or 1 Alpha + 5-9 Numeric
            case 'MT': return licenseNumber.matches(/^([0-9]{9}|[0-9]{13})$/) // 9 Numeric or 13 Numeric
            case 'NE': return licenseNumber.matches(/^[a-zA-Z][0-9]{3,8}$/) // 1 Alpha + 3-8 Numeric
            case 'NH': return licenseNumber.matches(/^[0-9]{2}[a-zA-Z]{3}[0-9]{4}[1-9]$/) // 2 Numeric + 3 Alpha + 5 Numeric, last number is non-zero -- LN
            case 'NJ': return licenseNumber.matches(/^[a-zA-Z][0-9]{14}$/) // 1 Alpha + 14 Numeric
            case 'NC': return licenseNumber.matches(/^[0-9]{1,12}$/) // 1-12 Numeric
            case 'ND': return licenseNumber.matches(/^([0-9]{9}|[a-zA-Z]{3}[0-9]{6})$/) // 9 Numeric or 3 Alpha + 6 Numeric
            case 'OH': return licenseNumber.matches(/^[a-zA-Z]{2}[0-9]{6}$/) // 2 Alpha + 6 Numeric
            case 'OK': return licenseNumber.matches(/^[a-hA-Hj-nJ-NpPr-wR-WyYzZ]?[0-9]{9}$/) // 0-1 Alpha (excluding 'I', 'O', 'Q', and 'X') + 9 Numeric -- LN
            case 'OR': return licenseNumber.matches(/^[a-zA-Z0-9][0-9]{6}$/) // 1 AlphaNumeric + 6 Numeric
            case 'PA': return licenseNumber.matches(/^[0-9]{8}$/) // 8 Numeric
            case 'RI': return licenseNumber.matches(/^[vV0-9][0-9]{6}$/) // 'V' + 6 Numeric -- LN
            case 'SC': return licenseNumber.matches(/^[0-9]{1,10}$/) // 1-10 Numeric -- LN
            case 'SD': return licenseNumber.matches(/^([0-9]{6}|[0-9]{8,9})$/) // 6 Numeric or 8-9 Numeric -- LN
            case 'TN': return licenseNumber.matches(/^[0-9]{8,9}$/) // 8-9 Numeric -- LN
            case 'TX': return licenseNumber.matches(/^[0-9]{8}$/) // 8 Numeric
            case 'UT': return licenseNumber.matches(/^([0-9]{4,9}|0[0-9]{9})$/) // 4-9 Numeric or '0' + 9 Numeric -- LN
            case 'VT': return licenseNumber.matches(/^[0-9]{7}[0-9vV]$/) // 7 Numeric + 1 (Numeric or 'V') -- LN
            case 'WA': return licenseNumber.matches(/^[a-zA-Z]{2}[a-zA-Z\*]{3}[a-zA-Z][a-zA-Z\*][0-9]{3}[a-zA-Z1-9][a-nA-Np-zP-Z0-9]$/) // 2 Alpha + 3 (Alpha or *) + 1 Alpha + 1 (Alpha or *) + 3 Numeric + 1 AlphaNumeric (excluding '0') + 1 AlphaNumeric (excluding 'O') -- LN
            case 'WV': return licenseNumber.matches(/^([a-fA-FiIoOrRsS01][0-9]|[1xX][xX])[0-9]{5}$/) // ('A', 'B', 'C', 'D', 'E', 'F', 'I', 'O', 'R', 'S', '0', or '1') + 6 Numeric   or   ('1' or 'X') + 'X' + 5 Numeric -- LN
            case 'WI': return licenseNumber.matches(/^[a-zA-Z][0-9]{13}$/) // 1 Alpha + 13 Numeric
            case 'WY': return licenseNumber.matches(/^[0-9]{6}-?[0-9]{3}$/) // 9 Numeric or 6 Numeric + '-' + 3 Numeric
            default: return false
        }
    }
}
