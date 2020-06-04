package asm.serp.bytecode;
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
public class LocalVariableTypeTableDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "serp/bytecode/LocalVariableTypeTable", null, "serp/bytecode/LocalTable", null);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(ILserp/bytecode/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LocalTable", "<init>", "(ILserp/bytecode/Attributes;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableTypes", "()[Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "getLocals", "()[Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableType", "(I)Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "getLocal", "(I)Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableType", "(Ljava/lang/String;)Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "getLocal", "(Ljava/lang/String;)Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalVariableTypes", "(Ljava/lang/String;)[Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "getLocals", "(Ljava/lang/String;)[Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addLocalVariableType", "(Lserp/bytecode/LocalVariableType;)Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "addLocal", "(Lserp/bytecode/Local;)Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addLocalVariableType", "()Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "addLocal", "()Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addLocalVariableType", "(Ljava/lang/String;Ljava/lang/String;)Lserp/bytecode/LocalVariableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "addLocal", "(Ljava/lang/String;Ljava/lang/String;)Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "acceptVisit", "(Lserp/bytecode/visitor/BCVisitor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "enterLocalVariableTypeTable", "(Lserp/bytecode/LocalVariableTypeTable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableTypeTable", "getLocals", "()[Lserp/bytecode/Local;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lserp/bytecode/LocalVariableType;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Lserp/bytecode/LocalVariableType;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/LocalVariableType", "acceptVisit", "(Lserp/bytecode/visitor/BCVisitor;)V", false);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "serp/bytecode/visitor/BCVisitor", "exitLocalVariableTypeTable", "(Lserp/bytecode/LocalVariableTypeTable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newLocal", "()Lserp/bytecode/Local;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "serp/bytecode/LocalVariableType", "<init>", "(Lserp/bytecode/LocalVariableTypeTable;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newLocalArray", "(I)[Lserp/bytecode/Local;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "serp/bytecode/LocalVariableType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
