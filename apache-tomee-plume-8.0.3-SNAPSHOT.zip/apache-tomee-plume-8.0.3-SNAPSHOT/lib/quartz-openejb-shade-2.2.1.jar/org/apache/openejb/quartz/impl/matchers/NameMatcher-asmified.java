package asm.org.apache.openejb.quartz.impl.matchers;
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
public class NameMatcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "<T:Lorg/apache/openejb/quartz/utils/Key<*>;>Lorg/apache/openejb/quartz/impl/matchers/StringMatcher<TT;>;", "org/apache/openejb/quartz/impl/matchers/StringMatcher", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "org/apache/openejb/quartz/impl/matchers/StringMatcher", "StringOperatorName", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-33104959459613480L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/StringMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nameEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<*>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/NameMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobNameEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerNameEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nameStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "<U:Lorg/apache/openejb/quartz/utils/Key<*>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/NameMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "STARTS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobNameStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerNameStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nameEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "<U:Lorg/apache/openejb/quartz/utils/Key<*>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/NameMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ENDS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobNameEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerNameEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "nameContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "<U:Lorg/apache/openejb/quartz/utils/Key<*>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<TU;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/NameMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "CONTAINS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobNameContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerNameContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/NameMatcher", "nameContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/NameMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValue", "(Lorg/apache/openejb/quartz/utils/Key;)Ljava/lang/String;", "(TT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/Key", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
