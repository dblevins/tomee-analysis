package asm.org.apache.bval.jsr.metadata;
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
public class HierarchyBuilder$ElementDelegateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER | ACC_ABSTRACT, "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "<E::Ljava/lang/reflect/AnnotatedElement;T::Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement<TE;>;>Lorg/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate<TE;TT;>;", "org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "org/apache/bval/jsr/metadata/MetadataBuilder", "ForElement", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "ElementDelegate", ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", "org/apache/bval/jsr/metadata/HierarchyBuilder", "HierarchyDelegate", ACC_STATIC | ACC_ABSTRACT);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/MetadataBuilder$ForElement;Lorg/apache/bval/jsr/metadata/Meta;)V", "(TT;Lorg/apache/bval/jsr/metadata/Meta<TE;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/HierarchyBuilder$HierarchyDelegate", "<init>", "(Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;Lorg/apache/bval/jsr/metadata/Meta;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "getDeclaredConstraints", "()[Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "delegate", "Lorg/apache/bval/jsr/metadata/HasAnnotationBehavior;");
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/MetadataBuilder$ForElement");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/metadata/HierarchyBuilder$ElementDelegate", "hierarchyElement", "Lorg/apache/bval/jsr/metadata/Meta;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/bval/jsr/metadata/MetadataBuilder$ForElement", "getDeclaredConstraints", "(Lorg/apache/bval/jsr/metadata/Meta;)[Ljava/lang/annotation/Annotation;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
