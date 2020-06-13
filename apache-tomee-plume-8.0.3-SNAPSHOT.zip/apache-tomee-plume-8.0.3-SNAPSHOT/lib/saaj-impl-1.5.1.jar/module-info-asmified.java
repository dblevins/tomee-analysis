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
public class module-infoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V9, ACC_MODULE, "module-info", null, null, null);

ModuleVisitor moduleVisitor = classWriter.visitModule("com.sun.xml.messaging.saaj", 0, null);

moduleVisitor.visitRequire("java.base", ACC_MANDATED, "11");
moduleVisitor.visitRequire("org.jvnet.mimepull", 0, null);
moduleVisitor.visitRequire("java.xml.bind", 0, null);
moduleVisitor.visitRequire("org.jvnet.staxex", 0, null);
moduleVisitor.visitRequire("java.xml.soap", 0, null);
moduleVisitor.visitRequire("java.logging", 0, "11");
moduleVisitor.visitRequire("java.desktop", 0, "11");
moduleVisitor.visitRequire("java.xml", 0, "11");
moduleVisitor.visitExport("com/sun/xml/messaging/saaj", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/packaging/mime", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/packaging/mime/internet", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/packaging/mime/util", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/soap", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/soap/dynamic", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/soap/name", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/util", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/util/stax", 0);
moduleVisitor.visitExport("com/sun/xml/messaging/saaj/util/transform", 0);
moduleVisitor.visitProvide("jakarta/xml/soap/MessageFactory",  new String[] { "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPMessageFactory1_1Impl" });
moduleVisitor.visitProvide("jakarta/xml/soap/SAAJMetaFactory",  new String[] { "com/sun/xml/messaging/saaj/soap/SAAJMetaFactoryImpl" });
moduleVisitor.visitProvide("jakarta/xml/soap/SOAPConnectionFactory",  new String[] { "com/sun/xml/messaging/saaj/client/p2p/HttpSOAPConnectionFactory" });
moduleVisitor.visitProvide("jakarta/xml/soap/SOAPFactory",  new String[] { "com/sun/xml/messaging/saaj/soap/ver1_1/SOAPFactory1_1Impl" });
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
