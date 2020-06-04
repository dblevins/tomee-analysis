package asm.org.apache.catalina.session;
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
public class PersistentManagerBase$PrivilegedStoreSaveDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Ljava/lang/Void;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitInnerClass("org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "org/apache/catalina/session/PersistentManagerBase", "PrivilegedStoreSave", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "session", "Lorg/apache/catalina/Session;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/session/PersistentManagerBase;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/catalina/session/PersistentManagerBase;Lorg/apache/catalina/Session;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "this$0", "Lorg/apache/catalina/session/PersistentManagerBase;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "session", "Lorg/apache/catalina/Session;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Void;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "this$0", "Lorg/apache/catalina/session/PersistentManagerBase;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/session/PersistentManagerBase", "store", "Lorg/apache/catalina/Store;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "session", "Lorg/apache/catalina/Session;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/catalina/Store", "save", "(Lorg/apache/catalina/Session;)V", true);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/session/PersistentManagerBase$PrivilegedStoreSave", "run", "()Ljava/lang/Void;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
