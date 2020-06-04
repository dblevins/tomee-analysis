package asm.com.fasterxml.jackson.databind.introspect;
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
public class AnnotationCollectorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "com/fasterxml/jackson/databind/introspect/AnnotationCollector", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$TwoAnnotations", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "TwoAnnotations", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$OneAnnotation", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "OneAnnotation", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "NoAnnotations", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$NCollector", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "NCollector", ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$OneCollector", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "OneCollector", ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector", "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "EmptyCollector", ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL | ACC_STATIC, "NO_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/util/Annotations;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_data", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "_data", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyAnnotations", "()Lcom/fasterxml/jackson/databind/util/Annotations;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "NO_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/util/Annotations;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyCollector", "()Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector", "instance", "Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "emptyCollector", "(Ljava/lang/Object;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/introspect/AnnotationCollector$EmptyCollector", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asAnnotations", "()Lcom/fasterxml/jackson/databind/util/Annotations;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "asAnnotationMap", "()Lcom/fasterxml/jackson/databind/introspect/AnnotationMap;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getData", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "_data", "Ljava/lang/Object;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPresent", "(Ljava/lang/annotation/Annotation;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addOrOverride", "(Ljava/lang/annotation/Annotation;)Lcom/fasterxml/jackson/databind/introspect/AnnotationCollector;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/introspect/AnnotationCollector$NoAnnotations", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/fasterxml/jackson/databind/introspect/AnnotationCollector", "NO_ANNOTATIONS", "Lcom/fasterxml/jackson/databind/util/Annotations;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
