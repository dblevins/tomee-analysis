package asm.org.apache.tomcat.util.buf;
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
public class UriUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/tomcat/util/buf/UriUtil", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HEX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PATTERN_EXCLAMATION_MARK", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PATTERN_CARET", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PATTERN_ASTERISK", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "REPLACE_CUSTOM", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WAR_SEPARATOR", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isSchemeChar", "(C)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "isLetterOrDigit", "(C)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label0);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitIntInsn(BIPUSH, 46);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "hasScheme", "(Ljava/lang/CharSequence;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "length", "()I", true);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/CharSequence", "charAt", "(I)C", true);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 58);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label2);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLE, label3);
methodVisitor.visitInsn(ICONST_1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "isSchemeChar", "(C)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildJarUrl", "(Ljava/io/File;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "buildJarUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildJarUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "toURI", "()Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "buildJarUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildJarUrl", "(Ljava/lang/String;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "buildJarUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildJarUrl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "makeSafeForJarUrl", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "makeSafeForJarUrl", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/lang/StringBuilder"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jar");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "buildJarSafeUrl", "(Ljava/io/File;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "toURI", "()Ljava/net/URI;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URI", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/buf/UriUtil", "makeSafeForJarUrl", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "makeSafeForJarUrl", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_EXCLAMATION_MARK", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitLdcInsn("%21/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "replaceAll", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CARET", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitLdcInsn("%5e/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "replaceAll", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_ASTERISK", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitLdcInsn("%2a/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "replaceAll", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "matcher", "(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "REPLACE_CUSTOM", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "replaceAll", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "warToJar", "(Ljava/net/URL;)Ljava/net/URL;", null, new String[] { "java/net/MalformedURLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "getFile", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\\*/");
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceFirst", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("^/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "contains", "(Ljava/lang/CharSequence;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("\\^/");
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceFirst", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Pattern", "pattern", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replaceFirst", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/net/URL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("jar");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "getHost", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "getPort", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/net/URL", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getWarSeparator", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "WAR_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 65);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 69);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "HEX", "[C");
methodVisitor.visitLdcInsn("!/");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_EXCLAMATION_MARK", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("\\^/");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CARET", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("\\*/");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_ASTERISK", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("org.apache.tomcat.util.buf.UriUtil.WAR_SEPARATOR");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "getProperty", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("*/");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "WAR_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "REPLACE_CUSTOM", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "WAR_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "WAR_SEPARATOR", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "quote", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "PATTERN_CUSTOM", "Ljava/util/regex/Pattern;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", "java/lang/StringBuffer", "[B", "[B", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(BALOAD);
methodVisitor.visitVarInsn(ISTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(IAND);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitIntInsn(SIPUSH, 240);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "HEX", "[C");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/buf/UriUtil", "HEX", "[C");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(CALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(C)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/buf/UriUtil", "REPLACE_CUSTOM", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}