package asm.org.apache.catalina.valves.rewrite;
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
public class Substitution$RewriteRuleBackReferenceElementDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/catalina/valves/rewrite/Substitution$RewriteRuleBackReferenceElement", null, "org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", null);

classWriter.visitInnerClass("org/apache/catalina/valves/rewrite/Substitution$RewriteRuleBackReferenceElement", "org/apache/catalina/valves/rewrite/Substitution", "RewriteRuleBackReferenceElement", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", "org/apache/catalina/valves/rewrite/Substitution", "SubstitutionElement", ACC_PUBLIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "n", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/catalina/valves/rewrite/Substitution;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/valves/rewrite/Substitution$RewriteRuleBackReferenceElement", "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/valves/rewrite/Substitution$SubstitutionElement", "<init>", "(Lorg/apache/catalina/valves/rewrite/Substitution;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "evaluate", "(Ljava/util/regex/Matcher;Ljava/util/regex/Matcher;Lorg/apache/catalina/valves/rewrite/Resolver;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$RewriteRuleBackReferenceElement", "n", "I");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/regex/Matcher", "group", "(I)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/valves/rewrite/Substitution$RewriteRuleBackReferenceElement", "this$0", "Lorg/apache/catalina/valves/rewrite/Substitution;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/catalina/valves/rewrite/Substitution", "access$000", "(Lorg/apache/catalina/valves/rewrite/Substitution;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/util/URLEncoder", "DEFAULT", "Lorg/apache/catalina/util/URLEncoder;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/valves/rewrite/Resolver", "getUriCharset", "()Ljava/nio/charset/Charset;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/catalina/util/URLEncoder", "encode", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
