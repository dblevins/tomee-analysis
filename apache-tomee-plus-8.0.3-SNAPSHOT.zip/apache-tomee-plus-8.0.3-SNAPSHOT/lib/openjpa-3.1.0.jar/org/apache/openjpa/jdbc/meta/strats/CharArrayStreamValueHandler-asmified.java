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
public class CharArrayStreamValueHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", null, "org/apache/openjpa/jdbc/meta/strats/AbstractValueHandler", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_instance", "Lorg/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/AbstractValueHandler", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getInstance", "()Lorg/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "_instance", "Lorg/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "map", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/String;Lorg/apache/openjpa/jdbc/schema/ColumnIO;Z)[Lorg/apache/openjpa/jdbc/schema/Column;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ValueMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getDBDictionary", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/DBDictionary", "delimitAll", "()Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "org/apache/openjpa/jdbc/meta/ValueMapping", "java/lang/String", "org/apache/openjpa/jdbc/schema/ColumnIO", Opcodes.INTEGER, "org/apache/openjpa/jdbc/sql/DBDictionary"}, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "org/apache/openjpa/jdbc/meta/ValueMapping", "java/lang/String", "org/apache/openjpa/jdbc/schema/ColumnIO", Opcodes.INTEGER, "org/apache/openjpa/jdbc/sql/DBDictionary"}, 2, new Object[] {"java/lang/String", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "newColumn", "(Ljava/lang/String;Z)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "map", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/ColumnIO;Z)[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "map", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/ColumnIO;Z)[Lorg/apache/openjpa/jdbc/schema/Column;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/schema/Column");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/Column", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "setIdentifier", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitIntInsn(SIPUSH, 1005);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "setJavaType", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "setSize", "(I)V", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/jdbc/schema/Column");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toDataStoreValue", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/Object;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/PrimitiveWrapperArrays", "toCharArray", "(Ljava/lang/Object;)[C", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/Sized");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/io/CharArrayReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/CharArrayReader", "<init>", "([C)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/Sized", "<init>", "(Ljava/lang/Object;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toObjectValue", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Ljava/lang/Object;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/Reader");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/io/CharArrayWriter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/CharArrayWriter", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/io/Reader", "java/io/CharArrayWriter"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/Reader", "read", "()I", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/CharArrayWriter", "write", "(I)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/StoreException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/StoreException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/CharArrayWriter", "toCharArray", "()[C", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/PrimitiveWrapperArrays", "toObjectValue", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;[C)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler", "_instance", "Lorg/apache/openjpa/jdbc/meta/strats/CharArrayStreamValueHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
