package asm.org.hsqldb;
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
public class ConstraintCoreDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/ConstraintCore", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/hsqldb/HsqlNameManager$HsqlName", "org/hsqldb/HsqlNameManager", "HsqlName", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(0, "refName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mainName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "uniqueName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "refTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mainTableName", "Lorg/hsqldb/HsqlNameManager$HsqlName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mainTable", "Lorg/hsqldb/Table;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mainCols", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "mainIndex", "Lorg/hsqldb/index/Index;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "refTable", "Lorg/hsqldb/Table;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "refCols", "[I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "refIndex", "Lorg/hsqldb/index/Index;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "deleteAction", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "updateAction", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "hasUpdateAction", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "hasDeleteAction", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(0, "matchType", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "duplicate", "()Lorg/hsqldb/ConstraintCore;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/ConstraintCore");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/ConstraintCore", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "refName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "refName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "mainName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "mainName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "uniqueName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "uniqueName", "Lorg/hsqldb/HsqlNameManager$HsqlName;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "mainTable", "Lorg/hsqldb/Table;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "mainTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "mainCols", "[I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "mainCols", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "mainIndex", "Lorg/hsqldb/index/Index;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "mainIndex", "Lorg/hsqldb/index/Index;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "refTable", "Lorg/hsqldb/Table;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "refTable", "Lorg/hsqldb/Table;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "refCols", "[I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "refCols", "[I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "refIndex", "Lorg/hsqldb/index/Index;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "refIndex", "Lorg/hsqldb/index/Index;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "deleteAction", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "deleteAction", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "updateAction", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "updateAction", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/ConstraintCore", "matchType", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/ConstraintCore", "matchType", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
