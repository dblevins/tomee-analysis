package asm.org.apache.openjpa.jdbc.kernel;
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
public class JDBCStoreQuery$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/sql/Union$Selector" });

classWriter.visitOuterClass("org/apache/openjpa/jdbc/kernel/JDBCStoreQuery", "populateUnion", "(Lorg/apache/openjpa/jdbc/sql/Union;[Lorg/apache/openjpa/jdbc/meta/ClassMapping;Z[Lorg/apache/openjpa/kernel/exps/ExpressionFactory;[Lorg/apache/openjpa/kernel/exps/QueryExpressions;[Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;ZIJJ)[Ljava/util/BitSet;");

classWriter.visitInnerClass("org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/Union$Selector", "org/apache/openjpa/jdbc/sql/Union", "Selector", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$mappings", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$subclasses", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$facts", "[Lorg/apache/openjpa/kernel/exps/ExpressionFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$exps", "[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$states", "[Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ctx", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$lrs", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$eager", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$start", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$end", "J", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$paged", "[Ljava/util/BitSet;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreQuery;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreQuery;[Lorg/apache/openjpa/jdbc/meta/ClassMapping;Z[Lorg/apache/openjpa/kernel/exps/ExpressionFactory;[Lorg/apache/openjpa/kernel/exps/QueryExpressions;[Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;ZIJJ[Ljava/util/BitSet;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$mappings", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$subclasses", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$facts", "[Lorg/apache/openjpa/kernel/exps/ExpressionFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$exps", "[Lorg/apache/openjpa/kernel/exps/QueryExpressions;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$states", "[Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$ctx", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$lrs", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 9);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$eager", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 10);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$start", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(LLOAD, 12);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$end", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 14);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$paged", "[Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 15);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/sql/Select;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "this$0", "Lorg/apache/openjpa/jdbc/kernel/JDBCStoreQuery;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$mappings", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$subclasses", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$facts", "[Lorg/apache/openjpa/kernel/exps/ExpressionFactory;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/kernel/exps/JDBCExpressionFactory");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$exps", "[Lorg/apache/openjpa/kernel/exps/QueryExpressions;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$states", "[Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$ctx", "Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$lrs", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$eager", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$start", "J");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$end", "J");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery", "access$100", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStoreQuery;Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/meta/ClassMapping;ZLorg/apache/openjpa/jdbc/kernel/exps/JDBCExpressionFactory;Lorg/apache/openjpa/kernel/exps/QueryExpressions;Lorg/apache/openjpa/jdbc/kernel/exps/QueryExpressionsState;Lorg/apache/openjpa/jdbc/kernel/exps/ExpContext;ZIJJ)Ljava/util/BitSet;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$paged", "[Ljava/util/BitSet;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/kernel/JDBCStoreQuery$1", "val$paged", "[Ljava/util/BitSet;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/BitSet"}, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(14, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
