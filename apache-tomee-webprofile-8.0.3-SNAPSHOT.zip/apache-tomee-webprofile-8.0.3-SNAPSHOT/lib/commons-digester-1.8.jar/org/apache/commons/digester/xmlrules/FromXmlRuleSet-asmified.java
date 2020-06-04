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
public class FromXmlRuleSetDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", null, "org/apache/commons/digester/RuleSetBase", null);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$1", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", null, 0);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$InputSourceXMLRulesLoader", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "InputSourceXMLRulesLoader", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "URLXMLRulesLoader", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "XMLRulesLoader", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DIGESTER_DTD_PATH", "Ljava/lang/String;", null, "org/apache/commons/digester/xmlrules/digester-rules.dtd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rulesLoader", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "rulesDigester", "Lorg/apache/commons/digester/Digester;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/net/URL;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/Digester");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Digester", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/Digester");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Digester", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/net/URL;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/RuleSetBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "<init>", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;Ljava/net/URL;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "init", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/xml/sax/InputSource;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "<init>", "()V", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/Digester");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Digester", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/DigesterRuleParser");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/Digester");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Digester", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/xml/sax/InputSource;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/RuleSetBase", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$InputSourceXMLRulesLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$InputSourceXMLRulesLoader", "<init>", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;Lorg/xml/sax/InputSource;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "init", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "init", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesLoader", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addRuleInstances", "(Lorg/apache/commons/digester/Digester;)V", null, new String[] { "org/apache/commons/digester/xmlrules/XmlLoadException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "addRuleInstances", "(Lorg/apache/commons/digester/Digester;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addRuleInstances", "(Lorg/apache/commons/digester/Digester;Ljava/lang/String;)V", null, new String[] { "org/apache/commons/digester/xmlrules/XmlLoadException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitLdcInsn("org/apache/commons/digester/xmlrules/digester-rules.dtd");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/XmlLoadException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Cannot find resource \"org/apache/commons/digester/xmlrules/digester-rules.dtd\"");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/XmlLoadException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "setDigesterRulesDTD", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "setTarget", "(Lorg/apache/commons/digester/Digester;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/DigesterRuleParser", "setBasePath", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "addRuleSet", "(Lorg/apache/commons/digester/RuleSet;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "parser", "Lorg/apache/commons/digester/xmlrules/DigesterRuleParser;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "push", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesLoader", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader", "loadRules", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;)Lorg/apache/commons/digester/Digester;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "rulesDigester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
