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
public class FromXmlRuleSet$URLXMLRulesLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_SUPER, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", null, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader", null);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "URLXMLRulesLoader", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "XMLRulesLoader", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/commons/digester/xmlrules/FromXmlRuleSet$1", "org/apache/commons/digester/xmlrules/FromXmlRuleSet", null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "url", "Ljava/net/URL;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;Ljava/net/URL;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$XMLRulesLoader", "<init>", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet$1;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "this$0", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "url", "Ljava/net/URL;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "loadRules", "()V", null, new String[] { "org/apache/commons/digester/xmlrules/XmlLoadException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "this$0", "Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/digester/xmlrules/FromXmlRuleSet", "access$100", "(Lorg/apache/commons/digester/xmlrules/FromXmlRuleSet;)Lorg/apache/commons/digester/Digester;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/xmlrules/FromXmlRuleSet$URLXMLRulesLoader", "url", "Ljava/net/URL;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "parse", "(Ljava/io/InputStream;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/digester/xmlrules/XmlLoadException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/xmlrules/XmlLoadException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
