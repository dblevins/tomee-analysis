package asm.org.apache.openjpa.persistence.meta;
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
public class Members$ListAttributeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/meta/Members$ListAttributeImpl", "<X:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/meta/Members$PluralAttributeImpl<TX;Ljava/util/List<TE;>;TE;>;Ljakarta/persistence/metamodel/ListAttribute<TX;TE;>;", "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", new String[] { "jakarta/persistence/metamodel/ListAttribute" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$ListAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "ListAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("jakarta/persistence/metamodel/PluralAttribute$CollectionType", "jakarta/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "PluralAttributeImpl", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;Lorg/apache/openjpa/meta/FieldMetaData;)V", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType<TX;>;Lorg/apache/openjpa/meta/FieldMetaData;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;Lorg/apache/openjpa/meta/FieldMetaData;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollectionType", "()Ljakarta/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/persistence/metamodel/PluralAttribute$CollectionType", "LIST", "Ljakarta/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
