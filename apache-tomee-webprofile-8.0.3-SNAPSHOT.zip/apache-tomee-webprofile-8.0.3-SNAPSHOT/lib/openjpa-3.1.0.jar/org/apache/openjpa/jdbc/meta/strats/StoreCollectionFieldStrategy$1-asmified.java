package asm.org.apache.openjpa.jdbc.meta.strats;
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
public class StoreCollectionFieldStrategy$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/sql/Union$Selector" });

classWriter.visitOuterClass("org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy", "selectEagerParallel", "(Lorg/apache/openjpa/jdbc/sql/SelectExecutor;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)V");

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/sql/Union$Selector", "org/apache/openjpa/jdbc/sql/Union", "Selector", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$elems", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$sm", "Lorg/apache/openjpa/kernel/OpenJPAStateManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$store", "Lorg/apache/openjpa/jdbc/kernel/JDBCStore;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$fetch", "Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$eagerMode", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy;[Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "this$0", "Lorg/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$elems", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$sm", "Lorg/apache/openjpa/kernel/OpenJPAStateManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$store", "Lorg/apache/openjpa/jdbc/kernel/JDBCStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$fetch", "Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$eagerMode", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/sql/Select;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "this$0", "Lorg/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$elems", "[Lorg/apache/openjpa/jdbc/meta/ClassMapping;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$sm", "Lorg/apache/openjpa/kernel/OpenJPAStateManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$store", "Lorg/apache/openjpa/jdbc/kernel/JDBCStore;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$fetch", "Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy$1", "val$eagerMode", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy", "access$000", "(Lorg/apache/openjpa/jdbc/meta/strats/StoreCollectionFieldStrategy;Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;IZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(9, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
