package asm.com.fasterxml.jackson.databind.deser.impl;
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
public class CreatorCandidateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "Param", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitInnerClass("com/fasterxml/jackson/annotation/JacksonInject$Value", "com/fasterxml/jackson/annotation/JacksonInject", "Value", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_intr", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_creator", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_paramCount", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED | ACC_FINAL, "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_intr", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_creator", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_paramCount", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "construct", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;)Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/AnnotatedWithParams", "getParameterCount", "()I", false);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {Opcodes.INTEGER, "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/AnnotatedWithParams", "getParameter", "(I)Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/AnnotationIntrospector", "findInjectableValue", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Lcom/fasterxml/jackson/annotation/JacksonInject$Value;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/fasterxml/jackson/databind/AnnotationIntrospector", "com/fasterxml/jackson/databind/introspect/AnnotatedWithParams", "[Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;", Opcodes.INTEGER, "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", Opcodes.INTEGER, "com/fasterxml/jackson/databind/introspect/AnnotatedParameter", "com/fasterxml/jackson/annotation/JacksonInject$Value"}, 5, new Object[] {"[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", Opcodes.INTEGER, label2, label2, "com/fasterxml/jackson/databind/introspect/AnnotatedParameter"});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"com/fasterxml/jackson/databind/AnnotationIntrospector", "com/fasterxml/jackson/databind/introspect/AnnotatedWithParams", "[Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;", Opcodes.INTEGER, "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", Opcodes.INTEGER, "com/fasterxml/jackson/databind/introspect/AnnotatedParameter", "com/fasterxml/jackson/annotation/JacksonInject$Value"}, 6, new Object[] {"[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;", Opcodes.INTEGER, label2, label2, "com/fasterxml/jackson/databind/introspect/AnnotatedParameter", "com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition"});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "<init>", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/annotation/JacksonInject$Value;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "<init>", "(Lcom/fasterxml/jackson/databind/AnnotationIntrospector;Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;I)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "creator", "()Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_creator", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "paramCount", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_paramCount", "I");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "injection", "(I)Lcom/fasterxml/jackson/annotation/JacksonInject$Value;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "injection", "Lcom/fasterxml/jackson/annotation/JacksonInject$Value;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parameter", "(I)Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "annotated", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "propertyDef", "(I)Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "propDef", "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "paramName", "(I)Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "propDef", "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition", "getFullName", "()Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "explicitParamName", "(I)Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "propDef", "Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition", "isExplicitlyNamed", "()Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition", "getFullName", "()Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/fasterxml/jackson/databind/introspect/BeanPropertyDefinition"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findImplicitParamName", "(I)Lcom/fasterxml/jackson/databind/PropertyName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_intr", "Lcom/fasterxml/jackson/databind/AnnotationIntrospector;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "annotated", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedParameter;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/AnnotationIntrospector", "findImplicitPropertyName", "(Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "isEmpty", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/fasterxml/jackson/databind/PropertyName", "construct", "(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findOnlyParamWithoutInjection", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_paramCount", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_params", "[Lcom/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param;");
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate$Param", "injection", "Lcom/fasterxml/jackson/annotation/JacksonInject$Value;");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFLT, label3);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/fasterxml/jackson/databind/deser/impl/CreatorCandidate", "_creator", "Lcom/fasterxml/jackson/databind/introspect/AnnotatedWithParams;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/fasterxml/jackson/databind/introspect/AnnotatedWithParams", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
