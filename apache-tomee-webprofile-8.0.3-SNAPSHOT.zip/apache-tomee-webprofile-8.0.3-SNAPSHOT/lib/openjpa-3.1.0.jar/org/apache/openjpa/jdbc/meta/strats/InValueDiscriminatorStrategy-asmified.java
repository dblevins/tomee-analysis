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
public class InValueDiscriminatorStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", null, "org/apache/openjpa/jdbc/meta/strats/AbstractDiscriminatorStrategy", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/AbstractDiscriminatorStrategy", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getJavaType", "()I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_ABSTRACT, "getClass", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Class;", null, new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "map", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getEmbeddingMetaData", "()Lorg/apache/openjpa/meta/ValueMetaData;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/meta/ClassMapping"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/MetaDataException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("not-base-disc");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/MetaDataException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getMappingInfo", "()Lorg/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "assertNoJoin", "(Lorg/apache/openjpa/meta/MetaDataContext;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitVarInsn(ILOAD, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", Opcodes.INTEGER, "org/apache/openjpa/jdbc/meta/ClassMapping", "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo"}, 2, new Object[] {"org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "org/apache/openjpa/jdbc/meta/Discriminator"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", Opcodes.INTEGER, "org/apache/openjpa/jdbc/meta/ClassMapping", "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo"}, 3, new Object[] {"org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "org/apache/openjpa/jdbc/meta/Discriminator", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "assertNoForeignKey", "(Lorg/apache/openjpa/meta/MetaDataContext;Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "assertNoUnique", "(Lorg/apache/openjpa/meta/MetaDataContext;Z)V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/schema/Column");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/Column", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getJavaType", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "setJavaType", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getDBDictionary", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn("typ");
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/DBDictionary", "delimitAll", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", Opcodes.INTEGER, "org/apache/openjpa/jdbc/meta/ClassMapping", "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "org/apache/openjpa/jdbc/schema/Column", "org/apache/openjpa/jdbc/sql/DBDictionary"}, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", Opcodes.INTEGER, "org/apache/openjpa/jdbc/meta/ClassMapping", "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "org/apache/openjpa/jdbc/schema/Column", "org/apache/openjpa/jdbc/sql/DBDictionary"}, 2, new Object[] {"java/lang/String", Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "newColumn", "(Ljava/lang/String;Z)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "setIdentifier", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/jdbc/schema/Column");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "getColumns", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;[Lorg/apache/openjpa/jdbc/schema/Column;Z)[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "setColumns", "([Lorg/apache/openjpa/jdbc/schema/Column;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "getColumnIO", "()Lorg/apache/openjpa/jdbc/schema/ColumnIO;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "setColumnIO", "(Lorg/apache/openjpa/jdbc/schema/ColumnIO;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/DiscriminatorMappingInfo", "getIndex", "(Lorg/apache/openjpa/jdbc/meta/Discriminator;[Lorg/apache/openjpa/jdbc/schema/Column;Z)Lorg/apache/openjpa/jdbc/schema/Index;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "setIndex", "(Lorg/apache/openjpa/jdbc/schema/Index;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "insert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getClassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getTable", "()Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/RowManager", "getRow", "(Lorg/apache/openjpa/jdbc/schema/Table;ILorg/apache/openjpa/kernel/OpenJPAStateManager;Z)Lorg/apache/openjpa/jdbc/sql/Row;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/OpenJPAStateManager", "getMetaData", "()Lorg/apache/openjpa/meta/ClassMetaData;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/meta/ClassMapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumnIO", "()Lorg/apache/openjpa/jdbc/schema/ColumnIO;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "org/apache/openjpa/kernel/OpenJPAStateManager", "org/apache/openjpa/jdbc/kernel/JDBCStore", "org/apache/openjpa/jdbc/sql/RowManager", "org/apache/openjpa/jdbc/sql/Row", "java/lang/Object"}, 2, new Object[] {"org/apache/openjpa/jdbc/schema/ColumnIO", Opcodes.INTEGER});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "org/apache/openjpa/kernel/OpenJPAStateManager", "org/apache/openjpa/jdbc/kernel/JDBCStore", "org/apache/openjpa/jdbc/sql/RowManager", "org/apache/openjpa/jdbc/sql/Row", "java/lang/Object"}, 3, new Object[] {"org/apache/openjpa/jdbc/schema/ColumnIO", Opcodes.INTEGER, Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/ColumnIO", "isInsertable", "(IZ)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Row", "setObject", "(Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "select", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "isFinal", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Select", "select", "([Lorg/apache/openjpa/jdbc/schema/Column;)I", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClass", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/sql/Result;)Ljava/lang/Class;", null, new String[] { "java/sql/SQLException", "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "isFinal", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "useDiscrimColumn", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/sql/Result;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getPCSuperclass", "()Ljava/lang/Class;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSubclassMappings", "()[Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getJavaType", "()I", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Result", "getObject", "(Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getClass", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "useDiscrimColumn", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Lorg/apache/openjpa/jdbc/sql/Result;)Z", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Result", "getBaseMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Result", "getBaseMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Result", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hasClassConditions", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;Z)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "isFinal", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSubclassMappings", "()[Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSuperclassMapping", "()Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Lorg/apache/openjpa/jdbc/meta/ClassMapping;"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassConditions", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/jdbc/sql/Joins;Lorg/apache/openjpa/jdbc/meta/ClassMapping;Z)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "disc", "Lorg/apache/openjpa/jdbc/meta/Discriminator;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/Discriminator", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/sql/SQLBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Select", "getConfiguration", "()Lorg/apache/openjpa/jdbc/conf/JDBCConfiguration;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/conf/JDBCConfiguration", "getDBDictionaryInstance", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "<init>", "(Lorg/apache/openjpa/jdbc/sql/DBDictionary;)V", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Select", "getColumnAlias", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Joins", "isOuter", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/openjpa/jdbc/schema/Column", "org/apache/openjpa/jdbc/sql/SQLBuffer", "java/lang/String"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn("(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/ClassMapping", "getJoinablePCSubclassMappings", "()[Lorg/apache/openjpa/jdbc/meta/ClassMapping;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Lorg/apache/openjpa/jdbc/meta/ClassMapping;"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(" = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "appendValue", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(" IS ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "appendValue", "(Ljava/lang/Object;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitLdcInsn(" OR ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(" IN (");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "appendValue", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitInsn(ARRAYLENGTH);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(", ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "getDiscriminatorValue", "(Lorg/apache/openjpa/jdbc/meta/ClassMapping;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "appendValue", "(Ljava/lang/Object;Lorg/apache/openjpa/jdbc/schema/Column;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 8);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitLdcInsn(")");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/SQLBuffer", "append", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/sql/SQLBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/meta/strats/InValueDiscriminatorStrategy", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
