
$('#btn-login').on('click', function () {

    let userName = $('#txtUsername').val();
    let passwordd = $('#passwordd').val();

    $.ajax({
        method: "GET",
        url: "http://localhost:8080/api/v1/user/onebyuserName/"+userName,
        async: true,
        success:function (resp) {
            console.log(resp.password);
            if (resp.password == passwordd && resp.state == "admin"){
                console.log("ela")
                switchToLogin();
            }else if (resp.password == passwordd && resp.state == "instructor"){
                console.log("ela22")
                switchToLogin2()

            }
            else if (resp.password == passwordd && resp.state == "student"){
                console.log("ela33")
                switchToLogin3()

            }else  {
                confirm("Signup First..!")
            }
        }

    });
});

function switchToLogin() {
    window.location.replace('http://localhost:63342/Dhamma_School/FrontEnd/Admin/index.html?_ijt=6dd99s37tbrnbud19fsg64ik0u');
}

function switchToLogin2() {
    window.location.replace('http://localhost:63342/Dhamma_School/FrontEnd/Instructor/index.html?_ijt=6dd99s37tbrnbud19fsg64ik0u');
}

function switchToLogin3() {
    window.location.replace('http://localhost:63342/Dhamma_School/FrontEnd/Student/index.html?_ijt=6dd99s37tbrnbud19fsg64ik0u');
}


let cusRegEx=/^[0-9]{1,10}$/;
let cusNRegEx=/^[A-z]{1,100}$/;
let cusARegEx=/^[A-z,0-9]{1,200}$/;
let cusSRegEx=/^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;

$("#nameid").on('keyup',function (event){
    if (event.key=="Enter"){
        $('#emailid').focus();
    }

    let inputID=$("#nameid").val();
    if (cusNRegEx.test(inputID)){
        $("#nameid").css('border','2px solid green');

    }else{
        $("#nameid").css('border','2px solid red');

    }
});

$("#mobileid").on('keyup',function (event){
    if (event.key=="Enter"){
        $('#addressid').focus();
    }

    let inputID=$("#mobileid").val();
    if (cusRegEx.test(inputID)){
        $("#mobileid").css('border','2px solid green');

    }else{
        $("#mobileid").css('border','2px solid red');

    }
});

$("#addressid").on('keyup',function (event){
    if (event.key=="Enter"){
        $('#unameid').focus();
    }

    let inputID=$("#addressid").val();
    if (cusARegEx.test(inputID)){
        $("#addressid").css('border','2px solid green');

    }else{
        $("#addressid").css('border','2px solid red');

    }
});

$("#emailid").on('keyup',function (event){
    if (event.key=="Enter"){
        $('#mobileid').focus();
    }

    let inputID=$("#emailid").val();
    if (cusSRegEx.test(inputID)){
        $("#emailid").css('border','2px solid green');

    }else{
        $("#emailid").css('border','2px solid red');

    }
});

