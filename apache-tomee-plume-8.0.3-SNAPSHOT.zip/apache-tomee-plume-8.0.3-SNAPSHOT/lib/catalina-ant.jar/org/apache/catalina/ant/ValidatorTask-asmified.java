package asm.org.apache.catalina.ant;
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
public class ValidatorTaskDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/ant/ValidatorTask", null, "org/apache/catalina/ant/BaseRedirectorHelperTask", null);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "path", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/ant/BaseRedirectorHelperTask", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ant/ValidatorTask", "path", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPath", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ant/ValidatorTask", "path", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPath", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/ant/ValidatorTask", "path", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "()V", null, new String[] { "org/apache/tools/ant/BuildException" });
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
methodVisitor.visitTryCatchBlock(label11, label12, label13, "java/lang/Exception");
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label11, label12, label14, null);
Label label15 = new Label();
methodVisitor.visitTryCatchBlock(label13, label15, label14, null);
Label label16 = new Label();
methodVisitor.visitTryCatchBlock(label14, label16, label14, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ant/ValidatorTask", "path", "Ljava/lang/String;");
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label17);
methodVisitor.visitTypeInsn(NEW, "org/apache/tools/ant/BuildException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Must specify 'path'");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tools/ant/BuildException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/ant/ValidatorTask", "path", "Ljava/lang/String;");
methodVisitor.visitLdcInsn("WEB-INF/web.xml");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "canRead", "()Z", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFNE, label18);
methodVisitor.visitTypeInsn(NEW, "org/apache/tools/ant/BuildException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot find web.xml");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tools/ant/BuildException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/File"}, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "getContextClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/ant/ValidatorTask;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/Globals", "IS_SECURITY_ENABLED", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/descriptor/DigesterFactory", "newDigester", "(ZZLorg/apache/tomcat/util/digester/RuleSet;Z)Lorg/apache/tomcat/util/digester/Digester;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label11);
methodVisitor.visitTypeInsn(NEW, "java/io/BufferedInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/FileInputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getCanonicalFile", "()Ljava/io/File;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/FileInputStream", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/BufferedInputStream", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label3);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/InputSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "toURI", "()Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toURL", "()Ljava/net/URL;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toExternalForm", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/InputSource", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/xml/sax/InputSource", "setByteStream", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "parse", "(Lorg/xml/sax/InputSource;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("web.xml validated");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "handleOutput", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/catalina/ant/ValidatorTask", "java/io/File", "java/lang/ClassLoader", "org/apache/tomcat/util/digester/Digester", "java/io/InputStream", "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label20);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label21);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"org/apache/catalina/ant/ValidatorTask", "java/io/File", "java/lang/ClassLoader", "org/apache/tomcat/util/digester/Digester", "java/io/InputStream", "java/lang/Throwable", Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label20);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/catalina/ant/ValidatorTask", "java/io/File", "java/lang/ClassLoader", "org/apache/tomcat/util/digester/Digester"}, 0, new Object[] {});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "closeRedirector", "()V", false);
Label label22 = new Label();
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "isFailOnError", "()Z", false);
Label label23 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label23);
methodVisitor.visitTypeInsn(NEW, "org/apache/tools/ant/BuildException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Validation failure");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tools/ant/BuildException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label23);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Exception"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Validation failure: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "handleErrorOutput", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label15);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "closeRedirector", "()V", false);
methodVisitor.visitJumpInsn(GOTO, label22);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/catalina/ant/ValidatorTask", "java/io/File", "java/lang/ClassLoader", "org/apache/tomcat/util/digester/Digester"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitLabel(label16);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Thread", "currentThread", "()Ljava/lang/Thread;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Thread", "setContextClassLoader", "(Ljava/lang/ClassLoader;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/ant/ValidatorTask", "closeRedirector", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}