package asm.org.apache.activemq.security;
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
public class SimpleCachedLDAPAuthorizationMap$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", null, "java/lang/Object", new String[] { "java/lang/Runnable" });

classWriter.visitOuterClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "checkForUpdates", "()V");

classWriter.visitInnerClass("org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "javax/naming/NamingException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "context", "Ljavax/naming/directory/DirContext;");
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$000", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNE, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$100", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;)I", false);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "currentTimeMillis", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$200", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;)J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$100", "(Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;)I", false);
methodVisitor.visitInsn(I2L);
methodVisitor.visitInsn(LADD);
methodVisitor.visitInsn(LCMP);
methodVisitor.visitJumpInsn(IFLT, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "isContextAlive", "()Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFNE, label8);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "createContext", "()Ljavax/naming/directory/DirContext;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "context", "Ljavax/naming/directory/DirContext;");
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"javax/naming/NamingException"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$300", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Updating authorization map!");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "debug", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap$2", "this$0", "Lorg/apache/activemq/security/SimpleCachedLDAPAuthorizationMap;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "query", "()V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/activemq/security/SimpleCachedLDAPAuthorizationMap", "access$300", "()Lorg/slf4j/Logger;", false);
methodVisitor.visitLdcInsn("Error updating authorization map.  Partial policy may be applied until the next successful update.");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/slf4j/Logger", "error", "(Ljava/lang/String;Ljava/lang/Throwable;)V", true);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
