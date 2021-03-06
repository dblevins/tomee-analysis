package asm.org.apache.jasper.compiler;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class TagFileProcessor$TagFileLoaderVisitorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", null, "org/apache/jasper/compiler/Node$Visitor", null);

classWriter.visitInnerClass("org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "org/apache/jasper/compiler/TagFileProcessor", "TagFileLoaderVisitor", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$CustomTag", "org/apache/jasper/compiler/Node", "CustomTag", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Visitor", "org/apache/jasper/compiler/Node", "Visitor", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "compiler", "Lorg/apache/jasper/compiler/Compiler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/jasper/compiler/TagFileProcessor;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/TagFileProcessor;Lorg/apache/jasper/compiler/Compiler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "this$0", "Lorg/apache/jasper/compiler/TagFileProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Visitor", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "compiler", "Lorg/apache/jasper/compiler/Compiler;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Compiler", "getPageInfo", "()Lorg/apache/jasper/compiler/PageInfo;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "visit", "(Lorg/apache/jasper/compiler/Node$CustomTag;)V", null, new String[] { "org/apache/jasper/JasperException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label13, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getTagFileInfo", "()Ljakarta/servlet/jsp/tagext/TagFileInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagFileInfo", "getPath", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("/META-INF/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label15 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label15);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "compiler", "Lorg/apache/jasper/compiler/Compiler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Compiler", "getCompilationContext", "()Lorg/apache/jasper/JspCompilationContext;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagFileInfo", "getTagInfo", "()Ljakarta/servlet/jsp/tagext/TagInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagInfo", "getTagLibrary", "()Ljakarta/servlet/jsp/tagext/TagLibraryInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/servlet/jsp/tagext/TagLibraryInfo", "getURI", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/JspCompilationContext", "getTldResourcePath", "(Ljava/lang/String;)Lorg/apache/tomcat/util/descriptor/tld/TldResourcePath;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/descriptor/tld/TldResourcePath", "openJar", "()Lorg/apache/tomcat/Jar;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label16);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/descriptor/tld/TldResourcePath", "getEntryName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "getURL", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/descriptor/tld/TldResourcePath", "getEntryName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "getLastModified", "(Ljava/lang/String;)J", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "addDependant", "(Ljava/lang/String;Ljava/lang/Long;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "getURL", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "substring", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "getLastModified", "(Ljava/lang/String;)J", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "addDependant", "(Ljava/lang/String;Ljava/lang/Long;)V", false);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "org/apache/jasper/compiler/Node$CustomTag", "jakarta/servlet/jsp/tagext/TagFileInfo", "java/lang/String", "org/apache/tomcat/util/descriptor/tld/TldResourcePath", "org/apache/tomcat/Jar", "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "compiler", "Lorg/apache/jasper/compiler/Compiler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Compiler", "getCompilationContext", "()Lorg/apache/jasper/JspCompilationContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/JspCompilationContext", "getLastModified", "(Ljava/lang/String;)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "addDependant", "(Ljava/lang/String;Ljava/lang/Long;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label17);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "close", "()V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "close", "()V", true);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label18);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "close", "()V", true);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "org/apache/jasper/compiler/Node$CustomTag", "jakarta/servlet/jsp/tagext/TagFileInfo", "java/lang/String", "org/apache/tomcat/util/descriptor/tld/TldResourcePath", "org/apache/tomcat/Jar", "java/lang/Throwable", Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/tomcat/Jar", "close", "()V", true);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "org/apache/jasper/compiler/Node$CustomTag", "jakarta/servlet/jsp/tagext/TagFileInfo", "java/lang/String", "org/apache/tomcat/util/descriptor/tld/TldResourcePath"}, 0, new Object[] {});
Label label20 = new Label();
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/JasperException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/JasperException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
Label label21 = new Label();
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "compiler", "Lorg/apache/jasper/compiler/Compiler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Compiler", "getCompilationContext", "()Lorg/apache/jasper/JspCompilationContext;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/JspCompilationContext", "getLastModified", "(Ljava/lang/String;)Ljava/lang/Long;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "addDependant", "(Ljava/lang/String;Ljava/lang/Long;)V", false);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "this$0", "Lorg/apache/jasper/compiler/TagFileProcessor;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "compiler", "Lorg/apache/jasper/compiler/Compiler;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getTagInfo", "()Ljakarta/servlet/jsp/tagext/TagInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/jasper/compiler/TagFileProcessor", "access$000", "(Lorg/apache/jasper/compiler/TagFileProcessor;Lorg/apache/jasper/compiler/Compiler;Ljava/lang/String;Ljakarta/servlet/jsp/tagext/TagInfo;Lorg/apache/jasper/compiler/PageInfo;)Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "setTagHandlerClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/TagFileProcessor$TagFileLoaderVisitor", "visitBody", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
