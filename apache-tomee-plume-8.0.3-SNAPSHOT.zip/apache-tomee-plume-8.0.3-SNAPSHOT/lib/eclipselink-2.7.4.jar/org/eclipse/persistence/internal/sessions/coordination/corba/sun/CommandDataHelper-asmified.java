package asm.org.eclipse.persistence.internal.sessions.coordination.corba.sun;
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
public class CommandDataHelperDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", null, "java/lang/Object", new String[] { "org/omg/CORBA/portable/BoxedValueHelper" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_id", "Ljava/lang/String;", null, "IDL:org/eclipse/persistence/internal/remotecommand/corba/sun/CommandData:1.0");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_instance", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC | ACC_VOLATILE, "__typeCode", "Lorg/omg/CORBA/TypeCode;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "__active", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "_instance", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__active", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "insert", "(Lorg/omg/CORBA/Any;[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "create_output_stream", "()Lorg/omg/CORBA/portable/OutputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "type", "()Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "type", "(Lorg/omg/CORBA/TypeCode;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "write", "(Lorg/omg/CORBA/portable/OutputStream;[B)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/OutputStream", "create_input_stream", "()Lorg/omg/CORBA/portable/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "type", "()Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "read_value", "(Lorg/omg/CORBA/portable/InputStream;Lorg/omg/CORBA/TypeCode;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "extract", "(Lorg/omg/CORBA/Any;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/Any", "create_input_stream", "()Lorg/omg/CORBA/portable/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "read", "(Lorg/omg/CORBA/portable/InputStream;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "type", "()Lorg/omg/CORBA/TypeCode;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, null);
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label2, label5, label2, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label6);
methodVisitor.visitLdcInsn(Type.getType("Lorg/omg/CORBA/TypeCode;"));
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitInsn(MONITORENTER);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__active", "Z");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/omg/CORBA/ORB", "init", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitLdcInsn("IDL:org/eclipse/persistence/internal/remotecommand/corba/sun/CommandData:1.0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "create_recursive_tc", "(Ljava/lang/String;)Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/omg/CORBA/TypeCode", "java/lang/Class"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__active", "Z");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/omg/CORBA/ORB", "init", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/omg/CORBA/TCKind", "tk_octet", "Lorg/omg/CORBA/TCKind;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "get_primitive_tc", "(Lorg/omg/CORBA/TCKind;)Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/omg/CORBA/ORB", "init", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "create_sequence_tc", "(ILorg/omg/CORBA/TypeCode;)Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/omg/CORBA/ORB", "init", "()Lorg/omg/CORBA/ORB;", false);
methodVisitor.visitLdcInsn("IDL:org/eclipse/persistence/internal/remotecommand/corba/sun/CommandData:1.0");
methodVisitor.visitLdcInsn("CommandData");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/ORB", "create_value_box_tc", "(Ljava/lang/String;Ljava/lang/String;Lorg/omg/CORBA/TypeCode;)Lorg/omg/CORBA/TypeCode;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__typeCode", "Lorg/omg/CORBA/TypeCode;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "__active", "Z");
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label4);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(MONITOREXIT);
methodVisitor.visitLabel(label5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "id", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("IDL:org/eclipse/persistence/internal/remotecommand/corba/sun/CommandData:1.0");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "read", "(Lorg/omg/CORBA/portable/InputStream;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/omg/CORBA_2_3/portable/InputStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/BAD_PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/BAD_PARAM", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/omg/CORBA_2_3/portable/InputStream");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "_instance", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA_2_3/portable/InputStream", "read_value", "(Lorg/omg/CORBA/portable/BoxedValueHelper;)Ljava/io/Serializable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read_value", "(Lorg/omg/CORBA/portable/InputStream;)Ljava/io/Serializable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/InputStream", "read_long", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/InputStream", "read_octet_array", "([BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "write", "(Lorg/omg/CORBA/portable/OutputStream;[B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/omg/CORBA_2_3/portable/OutputStream");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/BAD_PARAM");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/BAD_PARAM", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(CHECKCAST, "org/omg/CORBA_2_3/portable/OutputStream");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper", "_instance", "Lorg/eclipse/persistence/internal/sessions/coordination/corba/sun/CommandDataHelper;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA_2_3/portable/OutputStream", "write_value", "(Ljava/io/Serializable;Lorg/omg/CORBA/portable/BoxedValueHelper;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write_value", "(Lorg/omg/CORBA/portable/OutputStream;Ljava/io/Serializable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "[B");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitTypeInsn(NEW, "org/omg/CORBA/MARSHAL");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/omg/CORBA/MARSHAL", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/OutputStream", "write_long", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/omg/CORBA/portable/OutputStream", "write_octet_array", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get_id", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("IDL:org/eclipse/persistence/internal/remotecommand/corba/sun/CommandData:1.0");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
