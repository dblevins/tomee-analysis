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
public class DigesterRuleParserDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/digester/xmlrules/DigesterRuleParser", null, "org/apache/commons/digester/RuleSetBase", null);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$1", "org/apache/commons/digester/xmlrules/DigesterRuleParser", null, 0);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesAliasRule", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetNestedPropertiesAliasRule", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesAliasRule", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetPropertiesAliasRule", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetRootRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetRootRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNextRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetNextRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetTopRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetTopRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetNestedPropertiesRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertyRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetPropertyRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "SetPropertiesRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectCreateRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "ObjectCreateRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$FactoryCreateRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "FactoryCreateRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$NodeCreateRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "NodeCreateRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectParamRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "ObjectParamRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$CallParamRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "CallParamRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$CallMethodRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "CallMethodRuleFactory", ACC_PROTECTED);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$BeanPropertySetterRuleFactory", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "BeanPropertySetterRuleFactory", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$RulesPrefixAdapter", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "RulesPrefixAdapter", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$IncludeRule", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "IncludeRule", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "PatternRule", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "org/apache/commons/digester/xmlrules/DigesterRuleParser", "PatternStack", ACC_PROTECTED);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGESTER_PUBLIC_ID", "Ljava/lang/String;", null, "-//Jakarta Apache //DTD digester-rules XML V1.0//EN");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "digesterDtdUrl", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "targetDigester", "Lorg/apache/commons/digester/Digester;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "basePath", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "includedFiles", "Ljava/util/Set;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_STATIC | ACC_SYNTHETIC, "class$org$apache$commons$digester$Rule", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/RuleSetBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "includedFiles", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/RuleSetBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "includedFiles", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "targetDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/commons/digester/Digester;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;Ljava/util/Set;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/RuleSetBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "includedFiles", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "targetDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "includedFiles", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTarget", "(Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "targetDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBasePath", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFLE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDigesterRulesDTD", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "digesterDtdUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getDigesterRulesDTD", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "digesterDtdUrl", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Lorg/apache/commons/digester/Rule;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "targetDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "basePath", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "patternStack", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addRuleInstances", "(Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "class$org$apache$commons$digester$Rule", "Ljava/lang/Class;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org.apache.commons.digester.Rule");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "class$", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "class$org$apache$commons$digester$Rule", "Ljava/lang/Class;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "class$org$apache$commons$digester$Rule", "Ljava/lang/Class;");
methodVisitor.visitLabel(label1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("-//Jakarta Apache //DTD digester-rules XML V1.0//EN");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "getDigesterRulesDTD", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "register", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/pattern");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/include");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$IncludeRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$IncludeRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/bean-property-setter-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$BeanPropertySetterRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$BeanPropertySetterRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/bean-property-setter-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/bean-property-setter-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-method-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$CallMethodRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$CallMethodRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-method-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-method-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-param-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectParamRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectParamRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-param-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-param-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-param-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$CallParamRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$CallParamRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-param-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/call-param-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/factory-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$FactoryCreateRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$FactoryCreateRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/factory-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/factory-create-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectCreateRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$ObjectCreateRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/object-create-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/node-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$NodeCreateRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$NodeCreateRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/node-create-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/node-create-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-properties-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-properties-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-properties-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-properties-rule/alias");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesAliasRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertiesAliasRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-property-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertyRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetPropertyRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-property-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-property-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-nested-properties-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-nested-properties-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-nested-properties-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-nested-properties-rule/alias");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesAliasRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNestedPropertiesAliasRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-top-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetTopRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetTopRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-top-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-top-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-next-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNextRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetNextRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-next-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-next-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-root-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetRootRuleFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$SetRootRuleFactory", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addFactoryCreate", "(Ljava/lang/String;Lorg/apache/commons/digester/ObjectCreationFactory;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-root-rule");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("pattern");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser$PatternRule", "<init>", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/commons/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("*/set-root-rule");
methodVisitor.visitLdcInsn("add");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addSetNext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "class$", "(Ljava/lang/String;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label1, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/NoClassDefFoundError");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NoClassDefFoundError", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)Ljava/util/Set;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "includedFiles", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/commons/digester/Digester;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;Ljava/util/Set;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "<init>", "(Lorg/apache/commons/digester/Digester;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser$PatternStack;Ljava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
