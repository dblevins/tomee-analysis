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
public class Members$PluralAttributeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "<X:Ljava/lang/Object;C:Ljava/lang/Object;E:Ljava/lang/Object;>Lorg/apache/openjpa/persistence/meta/Members$Member<TX;TC;>;Ljavax/persistence/metamodel/PluralAttribute<TX;TC;TE;>;", "org/apache/openjpa/persistence/meta/Members$Member", new String[] { "javax/persistence/metamodel/PluralAttribute" });

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "org/apache/openjpa/persistence/meta/Members", "PluralAttributeImpl", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("javax/persistence/metamodel/Bindable$BindableType", "javax/persistence/metamodel/Bindable", "BindableType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/persistence/metamodel/Attribute$PersistentAttributeType", "javax/persistence/metamodel/Attribute", "PersistentAttributeType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/Members$Member", "org/apache/openjpa/persistence/meta/Members", "Member", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;Lorg/apache/openjpa/meta/FieldMetaData;)V", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType<TX;>;Lorg/apache/openjpa/meta/FieldMetaData;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/Members$Member", "<init>", "(Lorg/apache/openjpa/persistence/meta/AbstractManagedType;Lorg/apache/openjpa/meta/FieldMetaData;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getElementType", "()Ljavax/persistence/metamodel/Type;", "()Ljavax/persistence/metamodel/Type<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "owner", "Lorg/apache/openjpa/persistence/meta/AbstractManagedType;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/AbstractManagedType", "model", "Lorg/apache/openjpa/persistence/meta/MetamodelImpl;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "getBindableJavaType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/MetamodelImpl", "getType", "(Ljava/lang/Class;)Ljavax/persistence/metamodel/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getBindableType", "()Ljavax/persistence/metamodel/Bindable$BindableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/Bindable$BindableType", "PLURAL_ATTRIBUTE", "Ljavax/persistence/metamodel/Bindable$BindableType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBindableJavaType", "()Ljava/lang/Class;", "()Ljava/lang/Class<TE;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/Members$PluralAttributeImpl", "fmd", "Lorg/apache/openjpa/meta/FieldMetaData;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/meta/FieldMetaData", "getElement", "()Lorg/apache/openjpa/meta/ValueMetaData;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/meta/ValueMetaData", "getDeclaredType", "()Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPersistentAttributeType", "()Ljavax/persistence/metamodel/Attribute$PersistentAttributeType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/Attribute$PersistentAttributeType", "ONE_TO_MANY", "Ljavax/persistence/metamodel/Attribute$PersistentAttributeType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
