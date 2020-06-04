package asm.jakarta.faces.component;
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
public class StateHolderSaver$StateHolderTupleIndicesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "Ljava/lang/Enum<Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "jakarta/faces/component/StateHolderSaver", "StateHolderTupleIndices", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "StateHolderSaverInstance", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ComponentAddedDynamically", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LastMember", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "$VALUES", "[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("StateHolderSaverInstance");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "StateHolderSaverInstance", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ComponentAddedDynamically");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ComponentAddedDynamically", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LastMember");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "LastMember", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "StateHolderSaverInstance", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "ComponentAddedDynamically", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "LastMember", "Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "jakarta/faces/component/StateHolderSaver$StateHolderTupleIndices", "$VALUES", "[Ljakarta/faces/component/StateHolderSaver$StateHolderTupleIndices;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
