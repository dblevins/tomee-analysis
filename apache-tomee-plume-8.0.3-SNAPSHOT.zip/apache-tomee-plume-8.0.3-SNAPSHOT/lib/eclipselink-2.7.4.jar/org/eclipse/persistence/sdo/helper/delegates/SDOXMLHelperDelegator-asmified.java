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
public class SDOXMLHelperDelegatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", null, "org/eclipse/persistence/sdo/helper/delegates/AbstractHelperDelegator", new String[] { "org/eclipse/persistence/sdo/helper/SDOXMLHelper" });

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
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "aHelperContext", "Lcommonj/sdo/helper/HelperContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTimeZone", "(Ljava/util/TimeZone;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setTimeZone", "(Ljava/util/TimeZone;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTimeZoneQualified", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setTimeZoneQualified", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/lang/String;)Lcommonj/sdo/helper/XMLDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Ljava/lang/String;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/io/InputStream;)Lcommonj/sdo/helper/XMLDocument;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Ljava/io/InputStream;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Lorg/xml/sax/InputSource;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Lorg/xml/sax/InputSource;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljava/io/Reader;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Ljava/io/Reader;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "load", "(Ljavax/xml/transform/Source;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "load", "(Ljavax/xml/transform/Source;Ljava/lang/String;Ljava/lang/Object;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "save", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "save", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "save", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;Ljava/io/OutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "save", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;Ljava/io/OutputStream;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "save", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/OutputStream;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "save", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/OutputStream;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "save", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/Writer;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "save", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/Writer;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "save", "(Lcommonj/sdo/helper/XMLDocument;Ljavax/xml/transform/Result;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "save", "(Lcommonj/sdo/helper/XMLDocument;Ljavax/xml/transform/Result;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "serialize", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/OutputStream;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "serialize", "(Lcommonj/sdo/helper/XMLDocument;Ljava/io/OutputStream;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createDocument", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/helper/XMLDocument;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "createDocument", "(Lcommonj/sdo/DataObject;Ljava/lang/String;Ljava/lang/String;)Lcommonj/sdo/helper/XMLDocument;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLoader", "(Lorg/eclipse/persistence/sdo/helper/SDOClassLoader;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setLoader", "(Lorg/eclipse/persistence/sdo/helper/SDOClassLoader;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoader", "()Lorg/eclipse/persistence/sdo/helper/SDOClassLoader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getLoader", "()Lorg/eclipse/persistence/sdo/helper/SDOClassLoader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlContext", "(Lorg/eclipse/persistence/oxm/XMLContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setXmlContext", "(Lorg/eclipse/persistence/oxm/XMLContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlContext", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getXmlContext", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addDescriptors", "(Ljava/util/List;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "addDescriptors", "(Ljava/util/List;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTopLinkProject", "(Lorg/eclipse/persistence/sessions/Project;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setTopLinkProject", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initializeDescriptor", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "initializeDescriptor", "(Lorg/eclipse/persistence/oxm/XMLDescriptor;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTopLinkProject", "()Lorg/eclipse/persistence/sessions/Project;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getTopLinkProject", "()Lorg/eclipse/persistence/sessions/Project;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlMarshaller", "(Lorg/eclipse/persistence/oxm/XMLMarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setXmlMarshaller", "(Lorg/eclipse/persistence/oxm/XMLMarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlMarshaller", "()Lorg/eclipse/persistence/oxm/XMLMarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getXmlMarshaller", "()Lorg/eclipse/persistence/oxm/XMLMarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "setXmlUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlUnmarshaller", "()Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getXmlUnmarshaller", "()Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/sdo/helper/SDOHelperContext", "getHelperContext", "()Lcommonj/sdo/helper/HelperContext;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "commonj/sdo/helper/HelperContext", "getXMLHelper", "()Lcommonj/sdo/helper/XMLHelper;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "reset", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlConversionManager", "()Lorg/eclipse/persistence/internal/oxm/XMLConversionManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegator", "getXMLHelperDelegate", "()Lorg/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/sdo/helper/delegates/SDOXMLHelperDelegate", "getXmlConversionManager", "()Lorg/eclipse/persistence/internal/oxm/XMLConversionManager;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
