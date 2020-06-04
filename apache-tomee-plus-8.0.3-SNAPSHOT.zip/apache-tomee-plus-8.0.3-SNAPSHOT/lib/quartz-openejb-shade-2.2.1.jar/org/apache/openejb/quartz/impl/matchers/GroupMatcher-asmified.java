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
public class GroupMatcherDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<T:Lorg/apache/openejb/quartz/utils/Key<*>;>Lorg/apache/openejb/quartz/impl/matchers/StringMatcher<TT;>;", "org/apache/openejb/quartz/impl/matchers/StringMatcher", null);

classWriter.visitInnerClass("org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "org/apache/openejb/quartz/impl/matchers/StringMatcher", "StringOperatorName", ACC_PUBLIC | ACC_STATIC | ACC_ENUM | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-3275767650469343849L));
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<TT;>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/GroupMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "EQUALS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobGroupEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerGroupEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupEquals", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<TT;>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/GroupMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "STARTS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobGroupStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerGroupStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupStartsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<TT;>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/GroupMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ENDS_WITH", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobGroupEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerGroupEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupEndsWith", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "groupContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<TT;>;>(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/GroupMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "CONTAINS", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "jobGroupContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "triggerGroupContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "groupContains", "(Ljava/lang/String;)Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyGroup", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "<T:Lorg/apache/openejb/quartz/utils/Key<TT;>;>()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<TT;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/quartz/impl/matchers/GroupMatcher");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName", "ANYTHING", "Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "<init>", "(Ljava/lang/String;Lorg/apache/openejb/quartz/impl/matchers/StringMatcher$StringOperatorName;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyJobGroup", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/JobKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "anyGroup", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "anyTriggerGroup", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher<Lorg/apache/openejb/quartz/TriggerKey;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/quartz/impl/matchers/GroupMatcher", "anyGroup", "()Lorg/apache/openejb/quartz/impl/matchers/GroupMatcher;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValue", "(Lorg/apache/openejb/quartz/utils/Key;)Ljava/lang/String;", "(TT;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/quartz/utils/Key", "getGroup", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
