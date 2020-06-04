package asm.org.eclipse.persistence.sdo.helper.delegates;
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
public class SDOXSDHelperDelegatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", null, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", new String[] { "org/eclipse/persistence/sdo/helper/SDOXSDHelper" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcommonj/sdo/helper/HelperContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalName", "(Lcommonj/sdo/Type;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getLocalName", "(Lcommonj/sdo/Type;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLocalName", "(Lcommonj/sdo/Property;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getLocalName", "(Lcommonj/sdo/Property;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceURI", "(Lcommonj/sdo/Type;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getNamespaceURI", "(Lcommonj/sdo/Type;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamespaceURI", "(Lcommonj/sdo/Property;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getNamespaceURI", "(Lcommonj/sdo/Property;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAttribute", "(Lcommonj/sdo/Property;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "isAttribute", "(Lcommonj/sdo/Property;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isElement", "(Lcommonj/sdo/Property;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "isElement", "(Lcommonj/sdo/Property;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMixed", "(Lcommonj/sdo/Type;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "isMixed", "(Lcommonj/sdo/Type;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isXSD", "(Lcommonj/sdo/Type;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "isXSD", "(Lcommonj/sdo/Type;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGlobalProperty", "(Ljava/lang/String;Ljava/lang/String;Z)Lcommonj/sdo/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getGlobalProperty", "(Ljava/lang/String;Ljava/lang/String;Z)Lcommonj/sdo/Property;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getGlobalProperty", "(Ljavax/xml/namespace/QName;Z)Lcommonj/sdo/Property;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getGlobalProperty", "(Ljavax/xml/namespace/QName;Z)Lcommonj/sdo/Property;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAppinfo", "(Lcommonj/sdo/Type;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getAppinfo", "(Lcommonj/sdo/Type;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAppinfo", "(Lcommonj/sdo/Property;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "getAppinfo", "(Lcommonj/sdo/Property;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Ljava/lang/String;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "define", "(Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Ljava/io/Reader;Ljava/lang/String;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "define", "(Ljava/io/Reader;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Ljavax/xml/transform/Source;Lorg/eclipse/persistence/sdo/helper/SchemaResolver;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "define", "(Ljavax/xml/transform/Source;Lorg/eclipse/persistence/sdo/helper/SchemaResolver;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "define", "(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "define", "(Ljava/io/InputStream;Ljava/lang/String;)Ljava/util/List;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "(Ljava/util/List;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "generate", "(Ljava/util/List;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "(Ljava/util/List;Ljava/util/Map;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "generate", "(Ljava/util/List;Ljava/util/Map;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "generate", "(Ljava/util/List;Lorg/eclipse/persistence/sdo/helper/SchemaLocationResolver;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "generate", "(Ljava/util/List;Lorg/eclipse/persistence/sdo/helper/SchemaLocationResolver;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "buildAppInfoMap", "(Ljava/util/List;)Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "buildAppInfoMap", "(Ljava/util/List;)Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addGlobalProperty", "(Ljavax/xml/namespace/QName;Lcommonj/sdo/Property;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "addGlobalProperty", "(Ljavax/xml/namespace/QName;Lcommonj/sdo/Property;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXSDHelper", "()Lcommonj/sdo/helper/XSDHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegator", "getXSDHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXSDHelperDelegate", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
