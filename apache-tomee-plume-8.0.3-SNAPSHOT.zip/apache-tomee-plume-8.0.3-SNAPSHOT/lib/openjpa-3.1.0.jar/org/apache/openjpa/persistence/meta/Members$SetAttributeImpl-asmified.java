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
public class Members$SetAttributeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/meta/Members$SetAttributeImpl", "<X:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/meta/Members$PluralAttributeImpl<TX;Ljava/util/Set<TE;>;TE;>;Ljavax/persistence/metamodel/SetAttribute<TX;TE;>;", "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", new String[] { "javax/persistence/metamodel/SetAttribute" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$SetAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "SetAttributeImpl", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/persistence/metamodel/PluralAttribute$CollectionType", "javax/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollectionType", "()Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "SET", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
