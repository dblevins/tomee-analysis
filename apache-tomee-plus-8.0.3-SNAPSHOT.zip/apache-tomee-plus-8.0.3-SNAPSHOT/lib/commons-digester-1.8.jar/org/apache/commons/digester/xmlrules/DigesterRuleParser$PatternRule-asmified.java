package asm.org.apache.commons.digester.xmlrules;
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
public class DigesterRuleParser$PatternRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_SUPER, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", null, "org/apache/commons/digester/Rule", null);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "PatternRule", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "PatternStack", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attrName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "pattern", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Rule", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "this$0", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "attrName", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "(Lorg/xml/sax/Attributes;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "attrName", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "pattern", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "pattern", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "this$0", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "pattern", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "push", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "end", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "pattern", "Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "this$0", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "pop", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
