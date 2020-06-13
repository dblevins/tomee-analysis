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

ModuleVisitor moduleVisitor = classWriter.visitModule("com.sun.xml.bind", 0, null);

moduleVisitor.visitRequire("java.base", ACC_MANDATED, "11");
moduleVisitor.visitRequire("java.xml.bind", 0, null);
moduleVisitor.visitRequire("java.compiler", 0, "11");
moduleVisitor.visitRequire("java.desktop", 0, "11");
moduleVisitor.visitRequire("java.logging", 0, "11");
moduleVisitor.visitRequire("jakarta.activation", ACC_TRANSITIVE, null);
moduleVisitor.visitRequire("java.xml", ACC_TRANSITIVE, "11");
moduleVisitor.visitRequire("com.sun.xml.txw2", 0, null);
moduleVisitor.visitRequire("com.sun.xml.fastinfoset", 0, null);
moduleVisitor.visitRequire("org.jvnet.staxex", 0, null);
moduleVisitor.visitRequire("com.sun.istack.runtime", 0, null);
moduleVisitor.visitExport("com/sun/xml/bind", 0);
moduleVisitor.visitExport("com/sun/xml/bind/annotation", 0);
moduleVisitor.visitExport("com/sun/xml/bind/api", 0);
moduleVisitor.visitExport("com/sun/xml/bind/api/impl", 0);
moduleVisitor.visitExport("com/sun/xml/bind/marshaller", 0);
moduleVisitor.visitExport("com/sun/xml/bind/unmarshaller", 0);
moduleVisitor.visitExport("com/sun/xml/bind/util", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/annotation", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/core", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/impl", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/nav", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/runtime", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/model/util", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/runtime", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/runtime/unmarshaller", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/schemagen", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/schemagen/episode", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/schemagen/xmlschema", 0);
moduleVisitor.visitExport("com/sun/xml/bind/v2/util", 0);
moduleVisitor.visitOpen("com/sun/xml/bind/v2/model/nav", 0, new String[] { "com.sun.tools.xjc" });
moduleVisitor.visitUse("jakarta/xml/bind/JAXBContextFactory");
moduleVisitor.visitProvide("jakarta/xml/bind/JAXBContextFactory",  new String[] { "com/sun/xml/bind/v2/JAXBContextFactory" });
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
