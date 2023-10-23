package baseball;

/* 플레이어가 제시한 숫자를 판정하고 결과를 반환 */
public class BaseballUmpire {
	private int umpireStrike(String com, String user) {
		int strike = 0;
		for (int i = 0; i < user.length(); i++) {
			if (isEquals(com, user, i)) {
				strike++;
			}
		}
		return strike;
	}

	private boolean isEquals(String com, String user, int i) {
		// com의 i번째 문자와 user의 i번째 문자가 서로 같다면 true
		return com.charAt(i) == user.charAt(i);
	}
}
