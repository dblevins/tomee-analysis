package asm.org.apache.tomcat.util.net.openssl;
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
public class OpenSSLEngine$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_SYNTHETIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", null, "java/lang/Object", null);

classWriter.visitOuterClass("org/apache/tomcat/util/net/openssl/OpenSSLEngine", null, null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "org/apache/tomcat/util/net/openssl/OpenSSLEngine", "ClientAuthMode", ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "org/apache/tomcat/util/net/openssl/OpenSSLEngine", "Accepted", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$Accepted", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$ClientAuthMode", "[I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchFieldError");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/NoSuchFieldError");
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/lang/NoSuchFieldError");
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
methodVisitor.visitTryCatchBlock(label9, label10, label11, "java/lang/NoSuchFieldError");
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTryCatchBlock(label12, label13, label14, "java/lang/NoSuchFieldError");
Label label15 = new Label();
Label label16 = new Label();
Label label17 = new Label();
methodVisitor.visitTryCatchBlock(label15, label16, label17, "java/lang/NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "values", "()[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$ClientAuthMode", "[I");
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$ClientAuthMode", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "NONE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$ClientAuthMode", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "REQUIRE", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$ClientAuthMode", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "OPTIONAL", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$ClientAuthMode", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label7);
Label label18 = new Label();
methodVisitor.visitJumpInsn(GOTO, label18);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "values", "()[Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$Accepted", "[I");
methodVisitor.visitLabel(label9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$Accepted", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "NOT", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label10);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$Accepted", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "IMPLICIT", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label13);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$1", "$SwitchMap$org$apache$tomcat$util$net$openssl$OpenSSLEngine$Accepted", "[I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "EXPLICIT", "Lorg/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/net/openssl/OpenSSLEngine$Accepted", "ordinal", "()I", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitLabel(label16);
Label label19 = new Label();
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchFieldError"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
