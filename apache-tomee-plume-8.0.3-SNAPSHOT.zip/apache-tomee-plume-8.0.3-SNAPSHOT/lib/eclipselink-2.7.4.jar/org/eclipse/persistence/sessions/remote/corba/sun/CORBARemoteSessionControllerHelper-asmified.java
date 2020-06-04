package asm.org.eclipse.persistence.sessions.remote.corba.sun;
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
public class CORBARemoteSessionControllerHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_id", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "__typeCode", "Lorg/omg/CORBA/TypeCode;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("IDL:org/eclipse/persistence/remote/corba/sun/CORBARemoteSessionController:1.0");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "_id", "Ljava/lang/String;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insert", "(Lorg/omg/CORBA/Any;Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "create_output_stream", "()Lorg/omg/CORBA/portable/OutputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "type", "()Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "type", "(Lorg/omg/CORBA/TypeCode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "write", "(Lorg/omg/CORBA/portable/OutputStream;Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/OutputStream", "create_input_stream", "()Lorg/omg/CORBA/portable/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "type", "()Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "read_value", "(Lorg/omg/CORBA/portable/InputStream;Lorg/omg/CORBA/TypeCode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "extract", "(Lorg/omg/CORBA/Any;)Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "create_input_stream", "()Lorg/omg/CORBA/portable/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "read", "(Lorg/omg/CORBA/portable/InputStream;)Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "type", "()Lorg/omg/CORBA/TypeCode;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/omg/CORBA/ORB", "init", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "id", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("CORBARemoteSessionController");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "create_interface_tc", "(Ljava/lang/String;Ljava/lang/String;)Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "id", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "_id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "read", "(Lorg/omg/CORBA/portable/InputStream;)Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/sessions/remote/corba/sun/_CORBARemoteSessionControllerStub;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/InputStream", "read_Object", "(Ljava/lang/Class;)Lorg/omg/CORBA/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "narrow", "(Lorg/omg/CORBA/Object;)Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "write", "(Lorg/omg/CORBA/portable/OutputStream;Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/OutputStream", "write_Object", "(Lorg/omg/CORBA/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "narrow", "(Lorg/omg/CORBA/Object;)Lorg/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionController");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sessions/remote/corba/sun/CORBARemoteSessionControllerHelper", "id", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/omg/CORBA/Object", "_is_a", "(Ljava/lang/String;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/BAD_PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/BAD_PARAM", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/omg/CORBA/portable/ObjectImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/ObjectImpl", "_get_delegate", "()Lorg/omg/CORBA/portable/Delegate;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/sessions/remote/corba/sun/_CORBARemoteSessionControllerStub");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sessions/remote/corba/sun/_CORBARemoteSessionControllerStub", "<init>", "(Lorg/omg/CORBA/portable/Delegate;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
