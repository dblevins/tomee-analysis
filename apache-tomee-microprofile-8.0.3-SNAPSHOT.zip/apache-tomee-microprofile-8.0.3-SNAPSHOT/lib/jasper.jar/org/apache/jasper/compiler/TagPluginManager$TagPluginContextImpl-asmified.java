package asm.org.apache.jasper.compiler;
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
public class TagPluginManager$TagPluginContextImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", null, "java/lang/Object", new String[] { "org/apache/jasper/compiler/tagplugin/TagPluginContext" });

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$CustomTag", "org/apache/jasper/compiler/Node", "CustomTag", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Nodes", "org/apache/jasper/compiler/Node", "Nodes", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "org/apache/jasper/compiler/TagPluginManager", "TagPluginContextImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$JspAttribute", "org/apache/jasper/compiler/Node", "JspAttribute", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Declaration", "org/apache/jasper/compiler/Node", "Declaration", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Scriptlet", "org/apache/jasper/compiler/Node", "Scriptlet", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$AttributeGenerator", "org/apache/jasper/compiler/Node", "AttributeGenerator", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$ChildInfo", "org/apache/jasper/compiler/Node", "ChildInfo", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/jasper/compiler/Node$Root", "org/apache/jasper/compiler/Node", "Root", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "node", "Lorg/apache/jasper/compiler/Node$CustomTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pluginAttributes", "Ljava/util/HashMap;", "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/jasper/compiler/Node$CustomTag;Lorg/apache/jasper/compiler/PageInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/compiler/Node$Nodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Nodes", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "setAtETag", "(Lorg/apache/jasper/compiler/Node$Nodes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/compiler/Node$Nodes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Nodes", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "setAtSTag", "(Lorg/apache/jasper/compiler/Node$Nodes;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "setUseTagPlugin", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pluginAttributes", "Ljava/util/HashMap;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParentContext", "()Lorg/apache/jasper/compiler/tagplugin/TagPluginContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getParent", "()Lorg/apache/jasper/compiler/Node;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(INSTANCEOF, "org/apache/jasper/compiler/Node$CustomTag");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/jasper/compiler/Node"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/jasper/compiler/Node$CustomTag");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getTagPluginContext", "()Lorg/apache/jasper/compiler/tagplugin/TagPluginContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPluginAttribute", "(Ljava/lang/String;Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pluginAttributes", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPluginAttribute", "(Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pluginAttributes", "Ljava/util/HashMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isScriptless", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getChildInfo", "()Lorg/apache/jasper/compiler/Node$ChildInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$ChildInfo", "isScriptless", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConstantAttribute", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "getNodeAttribute", "(Ljava/lang/String;)Lorg/apache/jasper/compiler/Node$JspAttribute;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/jasper/compiler/Node$JspAttribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$JspAttribute", "isLiteral", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConstantAttribute", "(Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "getNodeAttribute", "(Ljava/lang/String;)Lorg/apache/jasper/compiler/Node$JspAttribute;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/jasper/compiler/Node$JspAttribute"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$JspAttribute", "getValue", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAttributeSpecified", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "getNodeAttribute", "(Ljava/lang/String;)Lorg/apache/jasper/compiler/Node$JspAttribute;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTemporaryVariableName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getRoot", "()Lorg/apache/jasper/compiler/Node$Root;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Root", "nextTemporaryVariableName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateImport", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "addImport", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateDeclaration", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "isPluginDeclared", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/compiler/Node$Declaration");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getStart", "()Lorg/apache/jasper/compiler/Mark;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Declaration", "<init>", "(Ljava/lang/String;Lorg/apache/jasper/compiler/Mark;Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Nodes", "add", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateJavaSource", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/compiler/Node$Scriptlet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getStart", "()Lorg/apache/jasper/compiler/Mark;", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$Scriptlet", "<init>", "(Ljava/lang/String;Lorg/apache/jasper/compiler/Mark;Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Nodes", "add", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateAttribute", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/jasper/compiler/Node$AttributeGenerator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getStart", "()Lorg/apache/jasper/compiler/Mark;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/jasper/compiler/Node$AttributeGenerator", "<init>", "(Lorg/apache/jasper/compiler/Mark;Ljava/lang/String;Lorg/apache/jasper/compiler/Node$CustomTag;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$Nodes", "add", "(Lorg/apache/jasper/compiler/Node;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "dontUseTagPlugin", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "setUseTagPlugin", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generateBody", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getAtETag", "()Lorg/apache/jasper/compiler/Node$Nodes;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "curNodes", "Lorg/apache/jasper/compiler/Node$Nodes;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTagFile", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "pageInfo", "Lorg/apache/jasper/compiler/PageInfo;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/PageInfo", "isTagFile", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getNodeAttribute", "(Ljava/lang/String;)Lorg/apache/jasper/compiler/Node$JspAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/jasper/compiler/TagPluginManager$TagPluginContextImpl", "node", "Lorg/apache/jasper/compiler/Node$CustomTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$CustomTag", "getJspAttributes", "()[Lorg/apache/jasper/compiler/Node$JspAttribute;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"[Lorg/apache/jasper/compiler/Node$JspAttribute;", Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/jasper/compiler/Node$JspAttribute", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
