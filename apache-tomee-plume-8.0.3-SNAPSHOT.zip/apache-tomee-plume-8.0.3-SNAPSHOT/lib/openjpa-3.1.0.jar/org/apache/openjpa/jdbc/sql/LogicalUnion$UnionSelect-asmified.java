package asm.org.apache.openjpa.jdbc.sql;
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
public class LogicalUnion$UnionSelectDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/sql/Select" });

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "org/apache/openjpa/jdbc/sql/LogicalUnion", "UnionSelect", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "pos", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "orders", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "orderIdxs", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/jdbc/sql/LogicalUnion;Lorg/apache/openjpa/jdbc/sql/SelectImpl;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orders", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderIdxs", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "pos", "I");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setRecordOrderedIndexes", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDelegate", "()Lorg/apache/openjpa/jdbc/sql/SelectImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelectedOrderIndexes", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderIdxs", "Ljava/util/List;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getOrderedIndexes", "()Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderIdxs", "Ljava/util/List;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderIdxs", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfiguration", "()Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getConfiguration", "()Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "indexOf", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "pos", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toSelect", "(ZLorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "toSelect", "(ZLorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSQL", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getSQL", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toSelectCount", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "toSelectCount", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoDistinct", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getAutoDistinct", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoDistinct", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setAutoDistinct", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isDistinct", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "isDistinct", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDistinct", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setDistinct", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLRS", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "isLRS", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLRS", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setLRS", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoinSyntax", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getJoinSyntax", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJoinSyntax", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setJoinSyntax", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsRandomAccess", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "supportsRandomAccess", "(Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsLocking", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "supportsLocking", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasMultipleSelects", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "hasMultipleSelects", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCount", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)I", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getCount", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)Lorg/apache/openjpa/jdbc/sql/Result;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "execute", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)Lorg/apache/openjpa/jdbc/sql/Result;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)Lorg/apache/openjpa/jdbc/sql/Result;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "execute", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)Lorg/apache/openjpa/jdbc/sql/Result;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubselects", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/Collections", "EMPTY_LIST", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "()Lorg/apache/openjpa/jdbc/sql/Select;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSubselectPath", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setParent", "(Lorg/apache/openjpa/jdbc/sql/Select;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/sql/LogicalUnion", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("union-element");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UnsupportedException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setHasSubselect", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setHasSubselect", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHasSubselect", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getHasSubselect", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFromSelect", "()Lorg/apache/openjpa/jdbc/sql/Select;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFromSelect", "(Lorg/apache/openjpa/jdbc/sql/Select;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UnsupportedException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/sql/LogicalUnion", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("union-element");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UnsupportedException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasEagerJoin", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "hasEagerJoin", "(Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasJoin", "(Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "hasJoin", "(Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSelected", "(Lorg/apache/openjpa/jdbc/schema/Table;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "isSelected", "(Lorg/apache/openjpa/jdbc/schema/Table;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTableAliases", "()Ljava/util/Collection;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getTableAliases", "()Ljava/util/Collection;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelects", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getSelects", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelectAliases", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getSelectAliases", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIdentifierAliases", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getIdentifierAliases", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrdering", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getOrdering", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGrouping", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getGrouping", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWhere", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getWhere", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getHaving", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getHaving", "()Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addJoinClassConditions", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "addJoinClassConditions", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoinIterator", "()Ljava/util/Iterator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getJoinIterator", "()Ljava/util/Iterator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStartIndex", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getStartIndex", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEndIndex", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getEndIndex", "()J", false);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRange", "(JJ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(LLOAD, 1);
methodVisitor.visitVarInsn(LLOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setRange", "(JJ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnAlias", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getColumnAlias", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getColumnAlias", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getColumnAlias", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAggregate", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "isAggregate", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAggregate", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setAggregate", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isLob", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "isLob", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLob", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setLob", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectPlaceholder", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectPlaceholder", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearSelects", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "clearSelects", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Ljava/lang/String;Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Ljava/lang/String;Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Ljava/lang/String;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Ljava/lang/String;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/schema/Column;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Lorg/apache/openjpa/jdbc/schema/Column;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "([Lorg/apache/openjpa/jdbc/schema/Column;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "([Lorg/apache/openjpa/jdbc/schema/Column;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion", "mappings", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "pos", "I");
methodVisitor.visitInsn(AALOAD);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion", "mappings", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "pos", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "select", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "(Lorg/apache/openjpa/jdbc/schema/Column;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectIdentifier", "(Lorg/apache/openjpa/jdbc/schema/Column;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectIdentifier", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "([Lorg/apache/openjpa/jdbc/schema/Column;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectIdentifier", "([Lorg/apache/openjpa/jdbc/schema/Column;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectIdentifier", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectIdentifier", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "select", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;ILorg/apache/openjpa/jdbc/sql/Joins;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "selectPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/sql/Joins;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "selectPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/sql/Joins;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderByPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ZZ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderByPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderByPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/meta/ClassMapping"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "isPrimaryKeyObjectId", "(Z)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPrimaryKeyColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrderColumns", "([Lorg/apache/openjpa/jdbc/schema/Column;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "isUnion", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "orderByPrimaryKey", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ZLorg/apache/openjpa/jdbc/sql/Joins;ZZ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "recordOrder", "(Ljava/lang/Object;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderIdxs", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orders", "I");
methodVisitor.visitInsn(DUP_X1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orders", "I");
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion", "desc", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "get", "(I)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UserException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/sql/LogicalUnion", "access$000", "()Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitLdcInsn("incompat-ordering");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UserException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion", "desc", "Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/BitSet", "set", "(I)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "recordOrderColumns", "([Lorg/apache/openjpa/jdbc/schema/Column;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrder", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Lorg/apache/openjpa/jdbc/schema/Column;ZZ)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderBy", "(Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrder", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "isUnion", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "orderBy", "(Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;ZZ)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "([Lorg/apache/openjpa/jdbc/schema/Column;ZZ)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderBy", "([Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "([Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrderColumns", "([Lorg/apache/openjpa/jdbc/schema/Column;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "isUnion", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "orderBy", "([Lorg/apache/openjpa/jdbc/schema/Column;ZLorg/apache/openjpa/jdbc/sql/Joins;ZZ)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZZLorg/apache/openjpa/kernel/exps/Value;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZLorg/apache/openjpa/jdbc/sql/Joins;ZLorg/apache/openjpa/kernel/exps/Value;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZLorg/apache/openjpa/jdbc/sql/Joins;ZLorg/apache/openjpa/kernel/exps/Value;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "getSQL", "(Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrder", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "isUnion", "()Z", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "orderBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;ZLorg/apache/openjpa/jdbc/sql/Joins;ZZLorg/apache/openjpa/kernel/exps/Value;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Ljava/lang/String;ZZ)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "orderBy", "(Ljava/lang/String;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "orderBy", "(Ljava/lang/String;ZLorg/apache/openjpa/jdbc/sql/Joins;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "recordOrder", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/LogicalUnion", "isUnion", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "orderBy", "(Ljava/lang/String;ZLorg/apache/openjpa/jdbc/sql/Joins;ZZ)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "clearOrdering", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "clearOrdering", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "wherePrimaryKey", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "wherePrimaryKey", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "whereForeignKey", "(Lorg/apache/openjpa/jdbc/schema/ForeignKey;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "whereForeignKey", "(Lorg/apache/openjpa/jdbc/schema/ForeignKey;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "where", "(Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "where", "(Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "where", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "where", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "where", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "where", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "where", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "where", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "where", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "where", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "having", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "having", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "having", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "having", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "having", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "having", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "having", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "having", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Ljava/lang/String;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/schema/Column;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "([Lorg/apache/openjpa/jdbc/schema/Column;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "([Lorg/apache/openjpa/jdbc/schema/Column;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "([Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "groupBy", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "groupBy", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;ILorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "whereClone", "(I)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "whereClone", "(I)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "fullClone", "(I)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "fullClone", "(I)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "eagerClone", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;IZI)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "eagerClone", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;IZI)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/sql/SelectExecutor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/jdbc/sql/SelectExecutor"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEager", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getEager", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;)Lorg/apache/openjpa/jdbc/sql/SelectExecutor;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/sql/SelectExecutor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/jdbc/sql/SelectExecutor"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "newJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newOuterJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "newOuterJoins", "()Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "append", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "append", "(Lorg/apache/openjpa/jdbc/sql/SQLBuffer;Lorg/apache/openjpa/jdbc/sql/Joins;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "and", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "and", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "or", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "or", "(Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "outer", "(Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "outer", "(Lorg/apache/openjpa/jdbc/sql/Joins;)Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExpectedResultCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getExpectedResultCount", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExpectedResultCount", "(IZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setExpectedResultCount", "(IZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setContext", "(Lorg/apache/openjpa/kernel/exps/Context;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setContext", "(Lorg/apache/openjpa/kernel/exps/Context;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "ctx", "()Lorg/apache/openjpa/kernel/exps/Context;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSchemaAlias", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setSchemaAlias", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "logEagerRelations", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "logEagerRelations", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTablePerClassMeta", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTablePerClassMeta", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getTablePerClassMeta", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJoinedTableClassMeta", "(Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setJoinedTableClassMeta", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJoinedTableClassMeta", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getJoinedTableClassMeta", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setExcludedJoinedTableClassMeta", "(Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "setExcludedJoinedTableClassMeta", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getExcludedJoinedTableClassMeta", "()Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "sel", "Lorg/apache/openjpa/jdbc/sql/SelectImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SelectImpl", "getExcludedJoinedTableClassMeta", "()Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDictionary", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion$UnionSelect", "this$0", "Lorg/apache/openjpa/jdbc/sql/LogicalUnion;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/LogicalUnion", "dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
