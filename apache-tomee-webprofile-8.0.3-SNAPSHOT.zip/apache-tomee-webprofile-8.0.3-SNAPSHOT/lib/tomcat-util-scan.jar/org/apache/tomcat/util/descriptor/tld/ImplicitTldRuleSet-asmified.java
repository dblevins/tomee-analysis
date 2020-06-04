package asm.org.apache.tomcat.util.descriptor.tld;
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
public class ImplicitTldRuleSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet", null, "java/lang/Object", new String[] { "org/apache/tomcat/util/digester/RuleSet" });

classWriter.visitInnerClass("org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet", "ElementNotAllowedRule", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "sm", "Lorg/apache/tomcat/util/res/StringManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PREFIX", "Ljava/lang/String;", null, "taglib");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "VALIDATOR_PREFIX", "Ljava/lang/String;", null, "taglib/validator");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAG_PREFIX", "Ljava/lang/String;", null, "taglib/tag");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "TAGFILE_PREFIX", "Ljava/lang/String;", null, "taglib/tag-file");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FUNCTION_PREFIX", "Ljava/lang/String;", null, "taglib/function");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addRuleInstances", "(Lorg/apache/tomcat/util/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/tlibversion");
methodVisitor.visitLdcInsn("setTlibVersion");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/tlib-version");
methodVisitor.visitLdcInsn("setTlibVersion");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/jspversion");
methodVisitor.visitLdcInsn("setJspVersion");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/jsp-version");
methodVisitor.visitLdcInsn("setJspVersion");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/shortname");
methodVisitor.visitLdcInsn("setShortName");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/short-name");
methodVisitor.visitLdcInsn("setShortName");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addCallMethod", "(Ljava/lang/String;Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/uri");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/info");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/description");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/listener/listener-class");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/validator");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/tag");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/tag-file");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("taglib/function");
methodVisitor.visitTypeInsn(NEW, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$ElementNotAllowedRule", "<init>", "(Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/digester/Digester", "addRule", "(Ljava/lang/String;Lorg/apache/tomcat/util/digester/Rule;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Lorg/apache/tomcat/util/res/StringManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/res/StringManager", "getManager", "(Ljava/lang/Class;)Lorg/apache/tomcat/util/res/StringManager;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/tomcat/util/descriptor/tld/ImplicitTldRuleSet", "sm", "Lorg/apache/tomcat/util/res/StringManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
