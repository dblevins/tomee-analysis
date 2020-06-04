package asm.org.apache.cxf.feature.validation;
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
public class SchemaValidationFeatureDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/feature/validation/SchemaValidationFeature", "Lorg/apache/cxf/feature/DelegatingFeature<Lorg/apache/cxf/feature/validation/SchemaValidationFeature$Portable;>;", "org/apache/cxf/feature/DelegatingFeature", null);

classWriter.visitInnerClass("org/apache/cxf/feature/validation/SchemaValidationFeature$Portable", "org/apache/cxf/feature/validation/SchemaValidationFeature", "Portable", ACC_PUBLIC | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/feature/validation/SchemaValidationTypeProvider;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/feature/validation/SchemaValidationFeature$Portable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/feature/validation/SchemaValidationFeature$Portable", "<init>", "(Lorg/apache/cxf/feature/validation/SchemaValidationTypeProvider;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/feature/DelegatingFeature", "<init>", "(Lorg/apache/cxf/feature/AbstractPortableFeature;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
