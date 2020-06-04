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
public class POJOPropertyBuilder$5Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$5", "Ljava/lang/Object;Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$WithMember<Ljava/lang/String;>;", "java/lang/Object", new String[] { "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$WithMember" });

classWriter.visitOuterClass("com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder", "_findDescription", "()Ljava/lang/String;");

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$5", null, null, 0);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$WithMember", "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder", "WithMember", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$5", "this$0", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "withMember", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$5", "this$0", "Lcom/fasterxml/jackson/databind/introspect/POJOPropertyBuilder;");
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder", "_annotationIntrospector", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/AnnotationIntrospector", "findPropertyDescription", "(Lcom/fasterxml/jackson/databind/introspect/Annotated;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "withMember", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/POJOPropertyBuilder$5", "withMember", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
