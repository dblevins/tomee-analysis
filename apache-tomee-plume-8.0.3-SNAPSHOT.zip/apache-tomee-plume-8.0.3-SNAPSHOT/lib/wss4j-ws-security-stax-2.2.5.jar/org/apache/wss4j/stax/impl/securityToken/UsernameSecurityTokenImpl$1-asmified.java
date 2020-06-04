package asm.org.apache.wss4j.stax.impl.securityToken;
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
public class UsernameSecurityTokenImpl$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", null, "java/lang/Object", new String[] { "org/apache/wss4j/common/principal/UsernameTokenPrincipal" });

classWriter.visitOuterClass("org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "getPrincipal", "()Ljava/security/Principal;");

classWriter.visitInnerClass("org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", null, null, 0);

classWriter.visitInnerClass("org/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType", "org/apache/wss4j/stax/ext/WSSConstants", "UsernameTokenPasswordType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isPasswordDigest", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$000", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)Lorg/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType", "PASSWORD_DIGEST", "Lorg/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPasswordType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$000", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)Lorg/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/wss4j/stax/ext/WSSConstants$UsernameTokenPasswordType", "getNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$100", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPassword", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$200", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreatedTime", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$300", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNonce", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl$1", "this$0", "Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl", "access$400", "(Lorg/apache/wss4j/stax/impl/securityToken/UsernameSecurityTokenImpl;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
