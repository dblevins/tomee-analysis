package asm.org.apache.openjpa.persistence;
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
public class XMLPersistenceMetaDataSerializer$SerializationComparatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", null, "org/apache/openjpa/meta/MetaDataInheritanceComparator", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer", "SerializationComparator", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "this$0", "Lorg/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MetaDataInheritanceComparator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "this$0", "Lorg/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer", "type", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "this$0", "Lorg/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer", "type", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label4 = new Label();
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitLookupSwitchInsn(label9, new int[] { 10, 20, 30, 40, 50 }, new Label[] { label4, label5, label6, label7, label8 });
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/ClassMetaData");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/ClassMetaData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "compare", "(Lorg/apache/openjpa/meta/ClassMetaData;Lorg/apache/openjpa/meta/ClassMetaData;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/QueryMetaData");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/QueryMetaData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "compare", "(Lorg/apache/openjpa/meta/QueryMetaData;Lorg/apache/openjpa/meta/QueryMetaData;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/SequenceMetaData");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/SequenceMetaData");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "compare", "(Lorg/apache/openjpa/meta/SequenceMetaData;Lorg/apache/openjpa/meta/SequenceMetaData;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Comparable", "compareTo", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Comparable");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Comparable", "compareTo", "(Ljava/lang/Object;)I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "compareUnknown", "(Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "compareUnknown", "(Ljava/lang/Object;Ljava/lang/Object;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/InternalException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/InternalException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "compare", "(Lorg/apache/openjpa/meta/ClassMetaData;Lorg/apache/openjpa/meta/ClassMetaData;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getListingIndex", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getListingIndex", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitJumpInsn(IF_ICMPNE, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer", "access$100", "(Lorg/apache/openjpa/meta/ClassMetaData;)Lorg/apache/openjpa/persistence/MetaDataTag;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer", "access$100", "(Lorg/apache/openjpa/meta/ClassMetaData;)Lorg/apache/openjpa/persistence/MetaDataTag;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/MetaDataTag", "compareTo", "(Ljava/lang/Enum;)I", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/MetaDataTag", "compareTo", "(Ljava/lang/Enum;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"org/apache/openjpa/persistence/XMLPersistenceMetaDataSerializer$SerializationComparator", "org/apache/openjpa/meta/ClassMetaData", "org/apache/openjpa/meta/ClassMetaData", Opcodes.INTEGER, Opcodes.INTEGER, "org/apache/openjpa/persistence/MetaDataTag", "org/apache/openjpa/persistence/MetaDataTag"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/meta/MetaDataInheritanceComparator", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/ClassMetaData", "getDescribedType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_M1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "compare", "(Lorg/apache/openjpa/meta/QueryMetaData;Lorg/apache/openjpa/meta/QueryMetaData;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/QueryMetaData", "getLanguage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/QueryMetaData", "getLanguage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Objects", "equals", "(Ljava/lang/Object;Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitLdcInsn("openjpa.SQL");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/QueryMetaData", "getLanguage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/QueryMetaData", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/QueryMetaData", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "compare", "(Lorg/apache/openjpa/meta/SequenceMetaData;Lorg/apache/openjpa/meta/SequenceMetaData;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/SequenceMetaData", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/SequenceMetaData", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "compareTo", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
