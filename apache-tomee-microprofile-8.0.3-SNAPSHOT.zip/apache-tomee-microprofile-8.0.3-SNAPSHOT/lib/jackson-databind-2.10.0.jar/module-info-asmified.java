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

ModuleVisitor moduleVisitor = classWriter.visitModule("com.fasterxml.jackson.databind", ACC_SYNTHETIC, "2.10.0");

moduleVisitor.visitRequire("java.desktop", 0, null);
moduleVisitor.visitRequire("java.logging", 0, null);
moduleVisitor.visitRequire("com.fasterxml.jackson.annotation", ACC_TRANSITIVE, null);
moduleVisitor.visitRequire("com.fasterxml.jackson.core", ACC_TRANSITIVE, null);
moduleVisitor.visitRequire("java.sql", 0, null);
moduleVisitor.visitRequire("java.xml", 0, null);
moduleVisitor.visitRequire("java.base", ACC_MANDATED, null);
moduleVisitor.visitExport("com/fasterxml/jackson/databind", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/annotation", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/cfg", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/deser", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/deser/impl", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/deser/std", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/exc", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/ext", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/introspect", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/json", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/jsonFormatVisitors", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/jsonschema", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/jsontype", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/jsontype/impl", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/module", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/node", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/ser", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/ser/impl", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/ser/std", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/type", 0);
moduleVisitor.visitExport("com/fasterxml/jackson/databind/util", 0);
moduleVisitor.visitProvide("com/fasterxml/jackson/core/ObjectCodec",  new String[] { "com/fasterxml/jackson/databind/ObjectMapper" });
moduleVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
