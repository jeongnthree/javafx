package ch01_variable_operator.ch11_stream;

import java.io.File;
import java.text.DecimalFormat;

public class GetInfoFolder {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        System.out.println(pathname);

        File target = new File(pathname);
        System.out.println(target);

        if(target.exists()){
            System.out.println("존재하는 객체");
            if(target.isDirectory()){
                System.out.println("폴더입니다.");
                System.out.println("listFiles() 메소드는 하위 목록을 File 배열 형식으로 반환합니다.");
                File[] filelist = target.listFiles();
                System.out.println("하위 목록 개수 : " + filelist.length);
                System.out.println("목록 보여 주기");

                for (int i = 0; i < filelist.length; i++) {
                    if(filelist[i].isFile()){
                        System.out.println("파일 : " + filelist[i].getName());

                        if(filelist[i].getName().toUpperCase().equals("AA.TXT")){
                            System.out.println();
                            System.out.println("파일" + filelist[i].getName() + " 정보 출력");
                            System.out.println("절대 경로 : " + filelist[i].getAbsolutePath());
                            System.out.println("파일 크기 : " + filelist[i].length());
                            System.out.println("숨김 파일인가요? : " + filelist[i].isHidden());
                            System.out.println("마지막 수정 일자 : " + filelist[i].lastModified());
                            System.out.println("실행 가능한 파일인가요? : " + filelist[i].canExecute());
                            System.out.println();
                        }
                    }else{
                        System.out.println("폴더 : " + filelist[i].toString());

                        if(filelist[i].getName().toLowerCase().equals("folder1")){
                            System.out.println("폴더 이름 변경하기");
                            String oldName = "folder1";
                            String newName = "temp";

                            boolean isRename = filelist[i].renameTo(new File(pathname + "\\temp"));

                            if(isRename){
                                System.out.println("before : " + oldName + ", after : " + newName );
                            }else{
                                System.out.println("이름 변경 실패");
                            }
                        }
                    }
                }

                // bb.txt 파일이 존재하면 삭제, 존재하지 않으면 신규 생성
                File bbFile = new File(pathname, "bb.txt");
                if(bbFile.exists()){
                    boolean isDeleted = bbFile.delete();
                    if(isDeleted){
                        System.out.println(bbFile.getName() + " 파일 삭제 성공");
                    }else{
                        System.out.println(bbFile.getName() + " 파일 삭제 실패");
                    }
                }else{
                    try{
                        boolean isCreated = bbFile.createNewFile();

                        if(isCreated){
                            System.out.println(bbFile.getName() + " 파일 생성 성공");

                        }else{
                            System.out.println(bbFile.getName() + " 파일 생성 실패");
                        }
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }
                }

            }else{
                System.out.println("파일입니다.");
            }

            // 폴더 많이 만들기
            for (int i = 1; i < 1000; i++) {
                String filename = "folder" + new DecimalFormat("000").format(i);
                System.out.println(filename);

                File targetFolder = new File(pathname, filename);

                if(targetFolder.exists() == false){
                    boolean isMake = targetFolder.mkdir();
                    if(isMake){
                        System.out.println(filename + " 폴더 생성 성공");
                    }else{
                        System.out.println(filename + " 폴더 생성 실패");
                    }
                }else{
                    boolean isDeleted = targetFolder.delete();
                    if(isDeleted){
                        System.out.println(filename + " 폴더 삭제 성공");
                    }else{
                        System.out.println(filename + " 폴더 삭제 실패");
                    }
                }
            }

        }else{
            System.out.println("존재하지 않는 객체");
        }
    }
}
