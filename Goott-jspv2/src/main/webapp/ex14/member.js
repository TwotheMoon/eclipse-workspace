const form = document.getElementById("member-form");
const intputId = document.querySelector(".id");
const intputPw = document.querySelector(".pw");
const intputPwConfirm = document.querySelector(".pw_confirm");
const inputName = document.querySelector(".name");


// 회원가입 submit 핸들러
function handleSignUpSubmit(event){
	const userId = intputId.value;
	const userPw = intputPw.value;
	const userPwConfirm = intputPwConfirm.value;
	const userName = inputName.value;
	
	if(confirmValueLengthId(userId) == false){
		alert("아이디를 4~10자 사이로 입력해주세요");
		event.preventDefault();
	} else if (confirmValueLengthPw(userPw) == false) {
		alert("비밀번호를 8자 이상 입력해주세요");
		event.preventDefault();
	} else if (confirmPw(userPw, userPwConfirm) == false){
		alert("비밀번호가 달라요.");
		event.preventDefault();
	} else if(confirmName(userName) == false) {
		alert("이름을 한글자 이상 입력해주세요");
		event.preventDefault();
	} else {		
		alert("가입완료");
	}
}

// 아이디 길이 검사
function confirmValueLengthId(userId){
	if(userId.length < 4 || userId.length > 10){
		return false;
	} else {
		return true;
	}
}
// 비밀번호 길이 검사
function confirmValueLengthPw(userPw){
	if(userPw.length < 8){
		return false;
	} else {
		return true;
	}
}
// 비밀번호 동일 검사
function confirmPw (userPw, userPwConfirm){
	if(userPw !== userPwConfirm){
		return false;
	} else {
		return true;
	}
}
// 이름 길이 검사
function confirmName (userName){
	if(userName.length < 1){
		return false;
	} else {
		return true;
	}
}

form.addEventListener("submit", handleSignUpSubmit);